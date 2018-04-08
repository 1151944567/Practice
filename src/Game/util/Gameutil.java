package Game.util;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Gameutil {
  private Gameutil(){ }
  public static Image getImage(String path){
        //return new ImageIcon(Gameutil.class.getClassLoader().getResource(path).getImage());
      BufferedImage bi = null;
      try {
          URL u = Gameutil.class.getClassLoader().getResource(path);
          System.out.println(u);
          bi = javax.imageio.ImageIO.read(u);
      } catch (IOException e) {
          e.printStackTrace();
      }
      return bi;
      //return Toolkit.getDefaultToolkit().getImage(Gameutil.class.getClassLoader().getResource(path));
  }
}
