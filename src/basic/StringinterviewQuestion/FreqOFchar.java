package basic.StringinterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqOFchar {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string");
        String sen=sc.nextLine();

        char[] ary=sen.toCharArray();

        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=ary.length-1;i>0;i--){
            if(mp.containsKey(ary[i])){
                mp.put(ary[i],mp.get(ary[i])+1);
            }
            else {
                mp.put(ary[i],1);
            }
        }

        for (Map.Entry<Character,Integer> map: mp.entrySet()) {
            System.out.println(map.getKey()+" : "+map.getValue());

        }

    }
}
