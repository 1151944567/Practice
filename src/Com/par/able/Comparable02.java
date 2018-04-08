package Com.par.able;

public class Comparable02 {
    public static void main(String args[]){
        Student01 stu[] = {new Student01("张三",20),
                new Student01("李四",22),new Student01("王五",20),
                new Student01("赵六",20),new Student01("孙七",22)} ;
        java.util.Arrays.sort(stu,new StudentComparator()) ;
        for(int i=0;i<stu.length;i++){    // 循环输出数组中的内容
            System.out.println(stu[i]) ;
        }// 进行排序操作
    }
}
