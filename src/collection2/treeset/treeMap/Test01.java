package collection2.treeset.treeMap;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {//还可以用Map来存储
            Employee e = new Employee(33301,"蔡教艺",3000,"项目部","2007-10");
            Employee e1 = new Employee(3301,"aaa",3000,"项目部","2007-10");
            Employee e2 = new Employee(3331,"gaoqi",3000,"项目部","2007-10");
        List<Employee> list = new ArrayList<Employee>();
        list.add(e);
        list.add(e2);
        list.add(e1);
        PrintName(list);
    }
    public static void PrintName(List<Employee> list){
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getName());
        }
    }

}
