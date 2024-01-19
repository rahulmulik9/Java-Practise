package dataStructre.Generic.clasesUsingGeneric;

public class Main {
    public static void main(String[] args) {
        //using regular class
        ClsInteger myInt=new ClsInteger(10);
        ClsString myStr=new ClsString("Anbc");

        System.out.println(myInt.getA());
        System.out.println(myStr.getAb());

        //using generic class
        ClsGeneric myGINt=new ClsGeneric(10);
        ClsGeneric myGStr=new ClsGeneric("abc");

        //Better practise
        ClsGeneric <Integer>myGINta=new ClsGeneric<Integer>(10);
        ClsGeneric <String>myGStrb=new ClsGeneric<String>("abc");

        System.out.println(myGINt.getAb());
        System.out.println(myGStr.getAb());
        System.out.println(myGINta.getAb());
        System.out.println(myGStrb.getAb());
    }
}

class ClsInteger {
    int a;

    public ClsInteger(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
class ClsString {
    String ab;

    public ClsString(String ab) {
        this.ab = ab;
    }

    public String getAb() {
        return ab;
    }
}

class ClsGeneric<T>{
    T ab;

    public ClsGeneric(T ab) {
        this.ab = ab;
    }

    public T getAb() {
        return ab;
    }
}

