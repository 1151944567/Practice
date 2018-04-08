package IOpractice;

import java.io.*;

public class Fileutil {
    public static void copy(String srcpath,String destpath)throws FileNotFoundException,IOException {
        copy(new File(srcpath),new File(destpath));
    }
    public static void copy(File src,File destination)throws FileNotFoundException,IOException{
        if (!src.isFile()){
            throw new IOException("只能拷贝文件");
        }
        if (!destination.exists()){
            destination.createNewFile();
        }
        byte[] flush = new byte[1024];
        int len=0;
        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(destination);
        while (-1!=(len=is.read(flush))){
            os.write(flush,0,len);
        }
        os.flush();
        os.close();
        is.close();

    }
}
