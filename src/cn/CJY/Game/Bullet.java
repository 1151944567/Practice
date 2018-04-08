package cn.CJY.Game;

import Game.util.Constant;

import java.awt.*;

public class Bullet {
    double x,y;
    double degree;
    int speed =3;
    int height ,width;
    public Bullet(){
        degree = Math.random()*Math.PI*2;
        x=Constant.GAME_WIDTH/2;
        y=Constant.GAME_HEIGHT/2;
        height = 10;width =10;
    }
    public Rectangle getRect(){
        return new Rectangle((int)x, (int)y, width, height);
    }
    public void draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval((int)x,(int)y,width,height);
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);
        if (y> Constant.GAME_HEIGHT-height||y<30){
            degree = -degree;
        }
        if (x < 0||x>Constant.GAME_WIDTH-height) {
            degree=Math.PI-degree;
        }
        g.setColor(c);
    }
}
