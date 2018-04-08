package Game.util;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    public void launchFrame(){
        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        setLocation(100,100);
        setVisible(true);
        new Paintthread().start();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    class  Paintthread extends Thread{
        public void run(){
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }//重画窗口
}
