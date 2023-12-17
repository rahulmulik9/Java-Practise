package Basic.UDEMYJAVADATASTRUCTURE.Arrays;

import java.util.Scanner;

public class Averagetemp {
 public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Number of days");
        int days=sc.nextInt();
        int[] temp=new int[days];
        int sum=0;
        for(int i=0;i<days;i++){
            System.out.println((i+1)+" day temp");
            int te=sc.nextInt();
            temp[i]=te;
            sum=sum+te;
        }

        double average=sum/days;
        System.out.println("Average temp is : "+average);

        int day=0;
        for(int i=0;i<days;i++){
            if (average > temp[i]) {
                day++;
                }
            }
        System.out.println("Days below average temp : "+day);
        System.out.println("Days above average temp : "+(days-day));
    }


    }

