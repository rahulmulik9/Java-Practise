package basic.classoopsconcepts.overrideandoverload;

public class Parent {
    public void name(String fname){
        System.out.println("Your name is "+fname);
    }

    public void name(String fname,String lname){
        System.out.println("Your full name is "+fname+" "+lname);
    }
}
