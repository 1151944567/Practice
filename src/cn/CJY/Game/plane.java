package cn.CJY.Game;

import Game.util.Gameutil;
import org.w3c.dom.css.Rect;

import java.awt.*;
import java.awt.event.KeyEvent;

public class plane {
    double  x,y;
    Image image;
    boolean left,right,up,down;
    int speed =8;
    int width ,height;
    private boolean live =true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public Rectangle getRect(){
        return new Rectangle((int)x,(int) y, width, height);
    }
    public void draw(Graphics g){
        if (live) {
            g.drawImage(image, (int)x,(int) y, null);
            move();
        }
    }
    public plane(String path,int x,int y){
        super();
        this.image = Gameutil.getImage(path);
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
        this.x = x;
        this.y = y;
    }
    public plane(){}
    /*
   获取键盘输入决定飞机的坐标
   */
    public void PressedToControlDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case 37:
                left=true;
                break;
            case 38:
                up = true;
                break;
            case 39:
                right = true;
                break;
            case 40:
                down = true;
                break;
            default:
                break;
        }
    }
    public void ReleasedToControlDirection(KeyEvent e){

        switch (e.getKeyCode()){
            case 37:
                left=false;
                break;
            case 38:
                up = false;
                break;
            case 39:
                right = false;
                break;
            case 40:
               down = false;
                break;
            default:
                break;
        }

    }


    public void Control(){
        if (x<0){
            x=0;
        }
        if (x>500-width){
            x=500-width;
        }
        if (y<height){
            y=height;
        }
        if (y>500-height){
            y=500-height;
        }
    }//不让飞机越界
    public void move(){
           Control();
           if (left){
               x-=speed;
           }
           if (right){
               x+=speed;
           }
           if (up){
               y-=speed;
           }
           if (down){
               y+=speed;
           }
    }//移动飞机

}
