package DataStructre.Generic;

public class Main {
    public static void main(String[] args) {
        ///generic  is used when you don't want to define type
        /*
        Suppose there are three array of integer, string, character
        You want to print them , so instead if creating method for each of them , you can create a method with genericsc
        Generic not valid for Simple data type such as int, char...it is valid for Integer ,Character,  String
         */
        Integer[] intary = {1, 2, 3, 4};
        String[] strary = {"Ab", "Bb", "Cc", "Dd"};
        Character[] charary = {'a', 'b', 'c', 'd'};

        printInteger(intary);
        printString(strary);
        printChar(charary);
        //instead of doing this user generic i.e <T> widely used
        printUsingGeneric(intary);
        printUsingGeneric(strary);
        printUsingGeneric(charary);
    }

    private static <Thing> void printUsingGeneric(Thing[] ary) {
        for (Thing a : ary) {
            System.out.print(a);
        }

    }

    public static void printInteger(Integer[] abc) {
        for (int a : abc) {
            System.out.print(a);
        }
    }

    public static void printString(String[] abc) {
        for (String a : abc) {
            System.out.print(a);
        }
    }

    public static void printChar(Character[] abc) {
        for (char a : abc) {
            System.out.print(a);
        }
    }
}
