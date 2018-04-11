package IOpractice;

import java.io.*;

public class chariodemo {
    public static void main(String[] args) {
        File src = new File("F:/onetwo/12.txt");
        Reader reader = null;
        try {
            reader = new FileReader(src);
            char[] flush = new char[1024];
            int len = 0;
            while (-1!=(len=reader.read(flush))){
                String str = new String(flush, 0, len);

                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=reader )
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
