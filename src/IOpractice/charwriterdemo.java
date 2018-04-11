package IOpractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class charwriterdemo {
    public static void main(String[] args) {
        File dest = new File("F:/onetwo/2.txt");
        Writer wr = null;
        try {
             wr = new FileWriter(dest);
            String str = "月是故乡明\n";
            wr.write(str);
            wr.append("噢噢噢噢噢噢噢噢");
               wr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=wr){
                try {
                    wr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
