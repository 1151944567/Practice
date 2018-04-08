package cn.CJY.Game;

import Game.util.MyFrame;
import Game.util.Gameutil;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

public class PlaneGame extends MyFrame {
    Date startTime;
    Date endTime;
    Image bg = Gameutil.getImage("images/bg.jpg");
    plane p = new plane("images/plane.png", 50, 50);
    ArrayList BulletList = new ArrayList();

    public static void main(String[] args) {
        new PlaneGame().launchFrame();
    }
    @Override
    public void launchFrame(){
        super.launchFrame();//调用父类方法构建窗口
        addKeyListener(new KeyMonitor());//注册键盘监听器用于使用，不注册无法使用
        for (int i=0;i<30;i++){
            Bullet bullet = new Bullet();
            BulletList.add(bullet);
        }
        startTime = new Date();
    }
    /*
    键盘监听器：用于监听键盘的输入
     */
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            //System.out.println("按下："+e.getKeyCode());
             p.PressedToControlDirection(e);
        }
        @Override
        public void keyReleased(KeyEvent e){
            //System.out.println("释放"+e.getKeyCode());
            p.ReleasedToControlDirection(e);
        }
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(bg, 0, 0, null);
        p.draw(g);
        for (int i=0;i<BulletList.size();i++){
            Bullet bullet = (Bullet)BulletList.get(i);
            bullet.draw(g);
            boolean peng = bullet.getRect().intersects(p.getRect());
            if (peng){
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
                p.setLive(false);
                if (endTime==null)
                endTime = new Date();
            }
        }
        if (!p.isLive()){
             printGameover(g,"Game Over",200,250,30,Color.white);
        }
        long period = (endTime.getTime()-startTime.getTime())/1000;
        printGameover(g,"时间："+period+"秒",200,400,30,Color.white);
    }
    public void printGameover(Graphics g,String str,int x,int y,int size,Color color){
        Font f = new Font("宋体",Font.BOLD,size);
        g.setFont(f);
        Color c = g.getColor();
        g.setColor(color);
        g.drawString(str,x,y);
        g.setColor(c);

    }
}
