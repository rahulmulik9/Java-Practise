package Basic.DataStructure.stack.usingLinkedList;

import java.util.Scanner;
//for stack by using linkedlist me will add element at begining of the linked list and by retriving we will delet or peek from begining

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter how many element you want to add");
        int size= sc.nextInt();
        lnkst ls=new lnkst();

        for(int i=0;i<=size-1;i++){
            System.out.println("Enter data "+i);
            int a=sc.nextInt();
            ls.push(a);
        }
        ls.display();


    }
}
