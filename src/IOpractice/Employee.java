package IOpractice;

/**
 * Serializable只是个空接口，表示可以序列化
 */
public class Employee implements java.io.Serializable {
    private transient String name;
    float salary;
    int id;

    public Employee() {
    }

    public Employee(String name, float salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
