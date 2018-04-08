package TestCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        Collection c;
        List ls = new ArrayList();//ArrayList 是List 的子类，底层实现是数组，查询快，修改插入删除慢，Linkedlist则相反
        //Vector:用数组实现，线程安全，效率低
        ls.add("aaa");
        ls.add(new Date());//可以添加对象
        ls.add(1234);//自动装箱  Integer
        System.out.println(ls.size());//return 3返回元素个数
        System.out.println(ls.isEmpty());//是否为空
        //ls.remove("aaa");//移除元素，没有删除
        //ls.remove(new Date());
        //ls.remove("1234");
        System.out.println(ls.size());
        List list = new ArrayList();
        list.add("ccc");
        list.add("ddd");
        ls.add(list);//list被当成一个对象所以输出为4
        System.out.println(ls.size());
        System.out.println(ls.get(0));
        ls.set(0, "ddddd");//set方法在指定的位置添加元素
        System.out.println(ls.get(0));
    }
}
