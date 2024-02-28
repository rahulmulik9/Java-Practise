package basic.b2_OPPS_Concepts.ClassTypes;

public class HelloWordAnonymousClass {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }


        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };


        HelloWorld englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        englishGreeting.greetSomeone("Hello Rahul");

        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Hello Rahul");
    }

    public static void main(String... args) {
        HelloWordAnonymousClass myApp =
                new HelloWordAnonymousClass();
        myApp.sayHello();
    }
}
