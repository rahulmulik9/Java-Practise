public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TmpClass tmpclass = new TmpClass("Rahul is here");

        tmpclass.showName();

        tmpclass.setName("Thats cool. Lets Rock");
        tmpclass.showName();

    }
}