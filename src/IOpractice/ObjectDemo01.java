package IOpractice;

import java.io.*;

/**
 * 不是所有的对象都可以序列化，对象的序列化需要实现java.io.Serializable接口
 * 不是所有的对象属性都需要序列化，不需要的可以使用transient关键字
 */
public class ObjectDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       read("F:/onetwo/seri.txt");
    }
    //反序列化
    public static void read(String srcPath)throws IOException, FileNotFoundException,ClassNotFoundException{
        File src = new File(srcPath);
        ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new FileInputStream(src)));
        Object obj = dis.readObject();
        if (obj instanceof Employee){
            Employee employee = (Employee)obj;
            System.out.println(employee.getName());
            System.out.println(employee.getSalary());
        }

    }
    //序列化
    public static void seri(String destpath) throws IOException {
        Employee e = new Employee("cjy",12000,1);
        File dest = new File(destpath);
        ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
        dos.writeObject(e);
        dos.close();

    }
}
