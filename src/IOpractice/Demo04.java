package IOpractice;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo04 {
    public static void main(String[] args) {
        String path = "F:/onetwo";
        File src = new File(path);
       PrintName(src);

    }
    public static void PrintName(File src){
        if (src==null||!src.exists()){
            return;
        }
        System.out.println(src.getAbsolutePath());
        if (src.isDirectory()){
            for (File temp:src.listFiles()){
                 PrintName(temp);
            }
        }
    }
    /*public static void PrintName(File src,final String name){
        if (src==null||!src.exists()){
            return;
        }
        File[] files = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()||(pathname.isFile() && pathname.getName().toLowerCase().contains(name.toLowerCase()))){
                    return true;
                }
                return false;
            }
        });
        if (src.isDirectory()){

            for (File temp:files){
                PrintName(temp,name);
            }
        }
    }*/
}
