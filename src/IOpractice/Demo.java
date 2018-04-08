package IOpractice;

import java.io.File;

/**
 * 相对路径与绝对路径
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        String parentpath = "F:/onetwo";
        String name = "2.jpg";
        File src = new File(parentpath, name);//相对路径构建
        src = new File(new File(parentpath), name);
        System.out.println(src.getName());
        System.out.println(src.getPath());
        //绝对路径
        src = new File("F:/onetwo/2.jpg");
        System.out.println(src.getName());
        System.out.println(src.getPath());
        //没有盘符，以当前路径user.dir构建
        src = new File("text.txt");
        System.out.println(src.getAbsolutePath());
    }
}
