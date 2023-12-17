package Basic.DataStructure.stack.usingArray;

import java.util.Scanner;
//by using array for stack we will ad element as uual but we keep track of index where last element addded
//this element kown as top , initiallly it is at -1, when one element add it become 0(top++) so first element is at zero
public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter the Size of stack");
        int size=sc.nextInt();

        stck st=new stck(size);

        for(int i=0;i<size;i++) {
            System.out.println("Enter data");
            int a=sc.nextInt();
            st.push(a);
        }
        st.display();

    }
}
