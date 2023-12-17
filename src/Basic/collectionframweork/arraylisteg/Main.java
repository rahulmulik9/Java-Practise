package Basic.collectionframweork.arraylisteg;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static GloseryList gloseryList = new GloseryList();

    public static void main(String[] args) {
        boolean quite = false;
        int choice = 0;


        while (!quite) {
            System.out.println("Choose your option");
            System.out.println("1] For adding in list");
            System.out.println("2] For delet in list");
            System.out.println("3] For update in list");
            System.out.println("4] For view  list");
            System.out.println("5] For remove list");
            System.out.println("6] For exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case (1): {
                    add();
                    break;
                }
                case (2): {
                    remove();
                    break;
                }
                case (3): {
                    update();
                    break;
                }
                case (4): {
                    show();
                    break;
                }
                case (5): {
                    removeAll();
                    break;
                }
                case (6): {
                    quite = true;
                    System.out.println("You completed your task");
                    break;
                }
            }
        }


    }

    private static void add() {
        System.out.println("Name of item");
        String item = sc.nextLine();
        gloseryList.add(item);
    }

    private static void remove() {
        gloseryList.printAll();
        System.out.println("Enter number of item");
        int itemno = sc.nextInt();
        gloseryList.remove(itemno);
    }


    private static void update() {
        gloseryList.printAll();
        System.out.println("Enter number of item");
        int itemno = sc.nextInt();
        System.out.println("Enter update item");
        String item = sc.nextLine();
        gloseryList.update(itemno, item);

    }

    private static void show() {
        gloseryList.printAll();
    }

    private static void removeAll() {
        gloseryList.removeAll();
    }


}
