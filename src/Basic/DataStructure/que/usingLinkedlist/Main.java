package Basic.DataStructure.que.usingLinkedlist;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter que length");
        int size=sc.nextInt();


        Quels ql=new Quels();


        for(int i=0;i<size;i++){
            System.out.println("Enter element "+(i+1));
            int a=sc.nextInt();
            ql.add(a);
        }


        ql.display();
    }
}
