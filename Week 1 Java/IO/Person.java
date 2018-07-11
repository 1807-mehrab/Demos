import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name = "Joe";
    private transient int age = 80;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [" + name + ", " + age + "]";
    }
}