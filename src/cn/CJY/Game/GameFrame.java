package cn.CJY.Game;

import Game.util.Gameutil;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类
 */
public class GameFrame extends Frame {
    private double x=100,y=100;
    private double degree = 3.14/3;
    private double speed = 10;

    Image imag = Gameutil.getImage("images/plang.jpg");
  public void launchFrame(){
      setSize(500,500);
      setLocation(100,100);
      setVisible(true);

      addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
  }
  @Override
  public void paint(Graphics g){
      System.out.println("paint!!!!");
      g.drawImage(imag,(int)x,(int)y,null);
      x += speed * Math.cos(degree);
      y += speed * Math.sin(degree);
      if (speed>0){
          speed-=0.01;
      }else {
          speed=0;
      }
      if (y>500-30||y<0){
          degree = -degree;
      }
      if (x < 0||x>500-30) {
          degree=Math.PI-degree;
      }
  }
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.launchFrame();
    }
}
