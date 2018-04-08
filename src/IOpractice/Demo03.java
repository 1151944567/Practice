package IOpractice;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 操作目录
 * mkdir()创建目录，必须确保父目录存在，如果不存在，创建失败
 * mkdirs()创建目录，如果父目录不存在一起创建
 */
public class Demo03 {
    public static void main(String[] args) {
             test2();
    }
    public static void test1(){
        File src = new File("F:/onetwo/test01");
        src.mkdir();
        File src01 =   new File("F:/onetwo/test/tesi/tttt/你是说什么");
        src01.mkdirs();
    }
    public static void test2(){//输出文件名
        File src = new File("F:/onetwo");
        if (src.isDirectory()){
            System.out.println("子目录||文件名");
            String[] subname = src.list();
            for (String temp:subname){
                System.out.println(temp);
            }
            System.out.println("子目录||文件File");
            File[] files = src.listFiles();
            for (File temp:files){
                System.out.println(temp.getAbsolutePath());
            }
            System.out.println("子目录||.java对象");
            files = src.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    System.out.println(dir.getName());
                    return name.endsWith(".java");
                    //return new File(dir,name).isFile()&&name.endsWith(".java");
                }
            });
            for (File temp:files){
                System.out.println(temp.getAbsolutePath());
            }
        }
    }
}
