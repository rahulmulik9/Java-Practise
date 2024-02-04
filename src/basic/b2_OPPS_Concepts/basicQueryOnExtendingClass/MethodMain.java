package basic.b2_OPPS_Concepts.basicQueryOnExtendingClass;
class ParentM{
    public void getMethod(){
        System.out.println("I am Parent class");
    }
    public void getParentMethod(){
        System.out.println("This is Parent class method");
    }
}
class ChildM extends ParentM{
    public void getMethod(){
        System.out.println("I am Child class");
    }

    public void getChildMethod(){
        System.out.println("This is Child class method");
    }

}
public class MethodMain {
    public static void main(String[] args) {
       // ChildM cm= new ParentM();
        ParentM pm=new ChildM();
        pm.getParentMethod();    //ok  =>This is Parent class method
        //pm.getChildMethod();     //not possible


        ChildM cm= new ChildM();
        cm.getParentMethod();      //ok   =>This is Parent class method
        cm.getChildMethod();       //ok   => This is Child class method

    }
}
