package IOpractice;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args)  {
              test3();
    }
    public static void test(){
        File src = new File("F:/onetwo/2.jpg");
        System.out.println(src.getName());//返回名称
        System.out.println(src.getPath());//如果是绝对路径返回绝对路径，相对则返回相对路径
        System.out.println(src.getAbsolutePath());//返回绝对路径
        System.out.println(src.getParent());//返回上级目录,相对返回null
    }
    public static void test1(){
        String path = "F:/onetwo/2.jpg";
        File src = new File(path);
        System.out.println("文件是否存在："+src.exists());
        //是否可读写
        System.out.println(src.canWrite());
        if (src.isDirectory()){//isFile判断文件isDirectory()判断文件夹
            System.out.println("文件");
        }else {
            System.out.println("文件夹");
        }
        //长度
        System.out.println("长度为"+src.length());//字节数不能读取文件夹的长度
    }

    /**
     * 创建文件，存在同名文件返回false、createNewFile()
     * @throws IOException
     */
    public static void test3(){
        String path = "F:/onetwo/ffff.txt";
        File src = new File(path);
        try {
            src.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test2() throws IOException, InterruptedException {
            File temp=File.createTempFile("tes","temp",new File("F:/onetwo"));//临时文件的创建
            System.out.println("diaoyong ");
        Thread.sleep(10000);
        temp.deleteOnExit();
    }
}
