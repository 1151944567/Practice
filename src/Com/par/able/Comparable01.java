package Com.par.able;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable01 {
    public static void main(String[] args) {
        student stu[] = {new student("张三",20,90.0f),
                new student("李四",22,90.0f),new student("王五",20,99.0f),
                new student("赵六",20,70.0f),new student("孙七",22,100.0f)} ;
        List<student> list = new ArrayList<>();
        for (student s:
             stu) {
            list.add(s);
        }

        Collections.sort(list);
        System.out.println(list);
        //java.util.Arrays.sort(stu) ;
        for(int i=0;i<list.size();i++){    // 循环输出数组中的内容
            System.out.println(list.get(i)) ;
        }
    }
}
