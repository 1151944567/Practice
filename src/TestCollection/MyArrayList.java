package TestCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList,以便于更好的理解底层结构
 *
 * @author 蔡教艺
 */
public class MyArrayList {
    static List list1 = new ArrayList(4);
    private int size;
    private Object[] elementdata;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity:" + initialCapacity);
        }
        this.elementdata = new Object[initialCapacity];
    }

    public void add(Object obj) {
        //数组扩容和数据的拷贝
        if (size + 1 > elementdata.length) {
            Object[] newArray = new Object[size * 2 + 2];
            System.arraycopy(elementdata, 0, newArray, 0, elementdata.length);
            elementdata = newArray;

        }
        elementdata[size++] = obj;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementdata[index];
    }
public void remove(int index){
    int numMoved = size - index - 1;
    if (numMoved > 0)
        System.arraycopy(elementdata, index+1, elementdata, index, numMoved);
    elementdata[--size] = null;
}
public void remove(Object o){
        for (int i=0;i<size;i++){
            if (get(i).equals(o)){
                remove(i);
            }
        }
}

    public static void main(String[] args) {
        List list1 = new ArrayList(10);
        list1.add("aaaa");
        list1.remove(0);
        MyArrayList list = new MyArrayList(2);
        list.add("aaaaa");
        list.add("aaa3a");
        list.add("aaa1a");
        System.out.println(list.get(0));
    }
}
