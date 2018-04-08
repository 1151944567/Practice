package TestCollection;

/**
 * 自定义实现Map,不完美；
 */
public class CjyMap01 {
    MyEntry[] myEntries = new MyEntry[100];
    int size;
    public void put(Object key,Object value){
        MyEntry entry = new MyEntry(key, value);
        for (int i=0;i<size;i++){
            if (myEntries[i].key.equals(key)){
                myEntries[i].value = value;
                return;
            }
        }
        myEntries[size++]=entry;
    }
    public void remove(Object key){
        for (int i = 0; i <size ; i++) {
            if (myEntries[i].key.equals(key)){
                 System.arraycopy(myEntries,i+1,myEntries,i,size-i-1);
                 myEntries[--size]=null;
            }
        }
    }

    /**
     * 获取值
     * @param key
     * @return
     */
    public Object get(Object key){
        MyEntry entry = null;
        for (int i = 0;i<size;i++){
            if (myEntries[i].key.equals(key)){
                return myEntries[i].value;
        }}
        return null;
    }
    public static void main(String[] args) {
        CjyMap01 map01 = new CjyMap01();
        map01.put("aaa","ccc");
        map01.put("ace","gggg");
        System.out.println(map01.get("aaa"));
        System.out.println(map01.get("ace"));
        map01.remove("ace");
        System.out.println(map01.size);
    }

}
