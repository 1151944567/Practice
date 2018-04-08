package Com.par.able;
import java.util.Arrays.*;

public class student implements Comparable<student> {
    private String name;
    private int age;
    private float score;
    @Override
    public String toString(){
        return name+"\t"+this.age+"\t"+this.score;
    }

    public student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(student stu){
        if (this.score>stu.score){
            return -1;
        }
        else if (this.score<stu.score){
            return 1;
        }else {
            if(this.age>stu.age){
            return -1;
            }else if(this.age<stu.age){
                return 1;
            }else {
                return 0;
            }
        }
    }
}
