package collection2.treeset.treeMap;

public class Person {
    private final int handsome;
    private final String name;

    public int getHandsome() {
        return handsome;
    }

    public Person() {
        this.handsome=0;
        this.name = null;
    }

    public String getName() {
        return name;
    }
    public Person(int handsome, String name) {
        this.handsome = handsome;
        this.name = name;
    }
    @Override
    public String toString(){
        return "姓名："+this.getName()+"帅气"+this.getHandsome();
    }
}
