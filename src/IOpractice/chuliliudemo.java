package IOpractice;

import java.io.*;

/**
 * 处理流可以增强功能，提供性能，在节点流之上
 * 一缓冲流
 * 1）字节缓冲流
 * BufferedInputStream BufferedOutputStream
 * 2)字符缓冲流
 * BufferReader BufferWriter
 *
 *
 * 字节流文件拷贝加入缓冲流
 */
public class chuliliudemo {
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
        InputStream is = new BufferedInputStream(new FileInputStream(src));//加入缓冲流
        OutputStream os = new BufferedOutputStream(new FileOutputStream(destination));
        while (-1!=(len=is.read(flush))){
            os.write(flush,0,len);
        }
        os.flush();
        os.close();
        is.close();

    }
}
