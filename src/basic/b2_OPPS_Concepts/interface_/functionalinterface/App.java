package basic.b2_OPPS_Concepts.interface_.functionalinterface;


interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        System.out.println("run method code....");
        e.execute();
    }
};

public class App {
    public static void main(String[] args) {


        //anonymous inner class
        Executable e = new Executable() {
            @Override
            public void execute() {
                System.out.println("execute method block of java code.....");
            }
        };


        //lambda expression
        Executable r1 = () -> System.out.println("My Runnable");



        //creating class and calling from there
        Runner r = new Runner();
       //anonymous inner class
        r.run(new Executable() {
            public void execute() {
                System.out.println("execute method block of java code.....");
            }
        });

       //lambda expression
        System.out.println("=============");
        r.run(() -> System.out.println("execute method block of code....."));




    }
};

