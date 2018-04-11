package IOpractice;

import java.io.*;

public class iaowar {

    public static void main(String[] args) throws IOException{
        BufferedReader reader=null;
        {
            try {
                try {
                    reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("F:/onetwo/2.txt")),"utf-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        String string = null;
        while (null!=(string =reader.readLine())){
            System.out.println(string);
        }
    }

}
