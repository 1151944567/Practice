package IOpractice;

import java.io.UnsupportedEncodingException;

public class luanmajiejue {
    public static void main(String[] args) {
        //解码 byte->char
        String str = "中国";
        //编码 char->byte
        byte[] date = str.getBytes();
        System.out.println(new String(date));
        try {
            date = str.getBytes("gbk");//设定编码集
            System.out.println(new String(date));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
