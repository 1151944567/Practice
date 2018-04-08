package Com.par.able;
import java.util.* ;
class Student01{    // 指定类型为Student
    private String name ;
    private int age ;
    public Student01(String name,int age){
        this.name = name ;
        this.age = age ;
    }
    public boolean equals(Object obj){    // 覆写equals方法
        if(this==obj){
            return true ;
        }
        if(!(obj instanceof Student01)){
            return false ;
        }
        Student01 stu = (Student01) obj ;
        if(stu.name.equals(this.name)&&stu.age==this.age){
            return true ;
        }else{
            return false ;
        }
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public String getName(){
        return this.name ;
    }
    public int getAge(){
        return this.age ;
    }
    public String toString(){
        return name + "\t\t" + this.age  ;
    }
}




