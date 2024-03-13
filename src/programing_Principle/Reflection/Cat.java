package programing_Principle.Reflection;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){
        System.out.println("Hi");
    }

    private void callPrivate(int a){
        System.out.println("Private Method called");
    }

    public static void callStatic(){
        System.out.println("Static method called");
    }

    private static void callPrivateStatic(){
        System.out.println("Private Static method called");
    }
}
