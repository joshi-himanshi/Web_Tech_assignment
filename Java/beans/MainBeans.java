package beans;

public class MainBeans {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Himanshi");
        p.setAge(20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
