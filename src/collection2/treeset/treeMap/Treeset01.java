package collection2.treeset.treeMap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.TreeSet;

public class Treeset01 {
    public static void main(String[] args) {
        Person p1  = new Person(102,"aaa");
        Person p2  = new Person(104,"a");
        Person p3  = new Person(103,"aa");
        Person p4  = new Person(100,"aaaa");
        TreeSet<Person> treeSet = new TreeSet<>(
                new java.util.Comparator<Person>(){
                    @Override
                    public int compare(Person o1,Person o2){
                        return o1.getHandsome()-o2.getHandsome();
                    }
                }
        );
        treeSet.add(p1);//Treeset在添加数据时排序，数据更改不会影响原来的顺序，不要修改数据，否则可能重复，为了确保不能
        //修改，可以使用final关键字。在javabean实体类中
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        System.out.println(treeSet);
    }
}
