package basic.StringinterviewQuestion;

import java.util.Scanner;

public class ReverseString {
public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter String");
        String sen=sc.nextLine();


        //method 1. by using for
        String rev="";
        for(int i=sen.length()-1;i>=0;i--){
            rev=rev+sen.charAt(i);
        }
        System.out.println(rev);


        //mehod 2 by using array
        char[] ary=sen.toCharArray();
        for (int i=ary.length-1;i>=0;i--){
            System.out.print(ary[i]);
        }



    }
}
