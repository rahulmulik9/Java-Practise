package basic.b8_interface.functionalinterface.methodInterface;
/*If you want to give implementation some method inside the interface
* Then  there are two ways
* First one is use static method But issue is that we cant not override static method
* Another way is use default keyword that method can be overridden*/

interface Parent{
    public default String getAuth(){
        return "I am Parent";
    }

    public static void getName(){
        System.out.println("I am Parent static");
    }
    public String whoAmI();
}

class Child implements Parent{
  /*  @Override
    public String getAuth() {
        return Parent.super.getAuth();
    }
*/
    @Override
    public String whoAmI() {
        return "I am child";
    }

}
public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println( p.getAuth());
        System.out.println(p.whoAmI());

        Child c = new Child();
        System.out.println(c.getAuth());
        System.out.println(c.whoAmI());
    }
}
