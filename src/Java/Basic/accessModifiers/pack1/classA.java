package Java.Basic.accessModifiers.pack1;

public class classA {
    private String password;
    public String name;
    protected int id;
    int salary;

    public classA(String name, String password, int id, int salary){
        this.name = name;
        this.password = password;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "classA{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
