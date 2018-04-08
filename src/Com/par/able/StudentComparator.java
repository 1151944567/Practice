package Com.par.able;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student01> {    // 实现比较器
                                                    // 因为Object类中本身已经有了equals()方法
    public int compare(Student01 s1,Student01 s2){
        if(s1.equals(s2)){
            return 0 ;
        }else if(s1.getAge()<s2.getAge()){    // 按年龄比较
            return 1 ;
        }else{
            return -1 ;
        }
    }
}
