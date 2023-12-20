package basic.b2_OPPS_Concepts.typeCasting;

public class App {
    public static void main(String[] args) {
        Parent p = new Child();   //this is ok
      //  Child c = new Parent();  // this is not possible

        p.sayHi();    //o/p -> Child class method is called
       // p.sayHello();  //not possible
    }
}
