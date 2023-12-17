package basic.StringinterviewQuestion;


import java.util.Scanner;

//public class Palindrome {
//    public static Scanner sc=new Scanner(System.in);
//    public static void main(String[] args) {
//        System.out.println("Enter a number");
//        int num=sc.nextInt();
//        int temp=num;
//        int num1=0;
//        while(num != 0){
//            int r=num%10;
//            num1=(10*num1)+r;
//            num=num/10;
//        }
//
//        if(temp == num1) {System.out.println("Number is Palidrone");}
//        else {
//            System.out.println("not Palidron");
//        }
//    }
//}

public class Palindrome {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String sen=sc.nextLine();
        String sen2="";

        for(int i=sen.length()-1;i>=0;i--){
            sen2=sen2+sen.charAt(i);
        }
        System.out.println(sen2);
        if(sen2.equalsIgnoreCase(sen)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }


    }
}
