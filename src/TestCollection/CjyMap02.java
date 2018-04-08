package TestCollection;

import java.util.LinkedList;

/**
 * 自定义Map的升级版
 * 提高效率
 * Map底层实现是数组加链表
 * 采用Hashcode的方法
 * 数组里是一个链表对象，若哈希码重复，则在链表后加map对象
 */
public class CjyMap02 {
    LinkedList[] arr = new LinkedList[999];//Map的底层结构链表数组
    int size;

    /**
     * put方法
     * @param key
     * @param value
     */
    public void put(Object key,Object value){
        MyEntry entry = new MyEntry(key, value);
        int a = key.hashCode()%999;
        if (arr[a]==null){
            LinkedList linkedList = new LinkedList();
            linkedList.add(entry);
            arr[a]=linkedList;
        }else {
            arr[a].add(entry);
        }
    }

    /**
     * get方法
     * @param key
     * @return
     */
    public Object get(Object key){
        int a = key.hashCode()%999;
        if (arr[a]!=null){
            LinkedList linkedList = arr[a];
            for (int i = 0;i<linkedList.size();i++){
                MyEntry entry = (MyEntry) linkedList.get(i);
                if (entry.key.equals(key)){
                    return entry.value;
                }
            }
        }
        return null;
    }
}
