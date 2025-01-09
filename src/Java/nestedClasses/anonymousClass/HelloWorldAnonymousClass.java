package Java.nestedClasses.anonymousClass;

public class HelloWorldAnonymousClass {
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {
        // English Greeting
        // declare an inner class
        class EnglishGreeting implements HelloWorld {
            String name = "World";
            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        HelloWorld englishGreet = new EnglishGreeting();

        // French Greeting
        // anonymous class
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        englishGreet.greet();
        frenchGreeting.greetSomeone("Fred");
    }
    public static void main(String[] args) {
        HelloWorldAnonymousClass myApp = new HelloWorldAnonymousClass();
        myApp.sayHello();
    }
}
