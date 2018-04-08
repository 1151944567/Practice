package IOpractice;

import java.io.*;

public class readfiledemo {
    public static void main(String[] args) {
        //1建立与文件的联系
        File src = new File("F:/onetwo/2.txt");
        //2读取文件
        InputStream is =null;
        try {

             is = new FileInputStream(src);
             //不断读取文件
            byte[] bytes = new byte[10];
            int len=0;//实际读取大小

                while (-1!=(len=is.read(bytes))){
                    String info = new String(bytes, 0, len);
                    System.out.println(info);
                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
    }finally {
            if (null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}}
