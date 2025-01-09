package Java.multiThreading;

public class SampleObject {
    private String object = "test object";

    public String getObject() {
        return object;
    }
    public synchronized boolean setObject (String newObj) {
        boolean equal = object.equals(newObj);
        object = newObj;
        return !equal;
    }
        public synchronized String getFirstWord() {
            if (object.contains(" ")) {
                return object.substring(0, object.indexOf(" "));
            }
            return object;
        }

    public static void main(String[] args) {
        SampleObject ob1 = new SampleObject();
        SampleObject ob2 = new SampleObject();
        Thread t1 = new Thread(() -> ob1.setObject("Hi") );
        Thread t2 = new Thread(() -> ob1.setObject("Hello") );
        t1.start();
        t2.start();
    }
}
