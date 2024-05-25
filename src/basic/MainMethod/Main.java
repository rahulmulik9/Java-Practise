package basic.MainMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("String[] args");
    }

    /*So jvm will always call method which contain string[] args */

    public static void main(){
        System.out.println(" ");
    }
    public static void main(int x){
        System.out.println("X");
    }
}
