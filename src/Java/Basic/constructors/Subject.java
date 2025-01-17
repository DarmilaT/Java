package Java.Basic.constructors;

public class Subject {
    String sub;
    int id;

    Subject(){
        System.out.println("No argument");
    }

    public Subject(String sub1, int i) {
        this.id = i;
        this.sub = sub1;
        System.out.println("parameterized constructor");
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sub='" + sub + '\'' +
                ", id=" + id +
                '}';
    }
}
