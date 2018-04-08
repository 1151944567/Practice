package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            String string = (String)iterator.next();
            System.out.println(string);
        }
        for (Iterator iteraor = set.iterator();iteraor.hasNext();){
            String string = (String)iteraor.next();
            System.out.println(string);
        }
    }
}
