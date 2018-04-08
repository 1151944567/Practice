package TestCollection;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;

public class MyHashset {
    HashMap map;
    int size;
    public int size(){
        return map.size();
    }
    private static final Object PRESENT = new Object();
    public MyHashset(){
        map = new HashMap();
    }
    public void add(Object object){
        map.put(object, PRESENT);//set的不可重复就是利用了map中键对象的不可重复性
    }

    public static void main(String[] args) {
        MyHashset set = new MyHashset();
        set.add("aaa");
        set.add(new String());
        System.out.println(set.size());
    }
}
