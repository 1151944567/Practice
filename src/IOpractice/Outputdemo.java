package IOpractice;

import java.io.*;

public class Outputdemo {
    public static void main(String[] args) {
        File src = new File("F:/onetwo/2.txt");//1建立联系
        OutputStream os = null;
        String str = "today is gonna be a good day";
        try {
            os = new FileOutputStream(src, true);//选择 流
            byte[] data = str.getBytes();//将字符串转为数组
            os.write(data,0,data.length);//添加
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
