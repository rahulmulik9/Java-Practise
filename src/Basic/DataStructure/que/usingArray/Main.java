package Basic.DataStructure.que.usingArray;

import java.util.Scanner;

//by using array for que we will add element as uual but we keep track of index where last element addded and forst element
//this element kown as top and rear , initiallly it is at -1, when one element add it become 0(top++ and rear++) so first element is at zero
//after that rear inreased by one but top is same
//when elment is removed then top become top++ and rear remains same
public class Main {

    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("elements in que");
        int size=sc.nextInt();

        QueArray qu=new QueArray(size);


        for(int i=0;i<size;i++){
            System.out.println("Enter element"+i);
            int a= sc.nextInt();
            qu.add(a);
        }

        qu.display();
    }
}
