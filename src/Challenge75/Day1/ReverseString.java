package Challenge75.Day1;

public class ReverseString {
    public static void main(String[] args) {
        System.out.printf(ReverseTheString("HELLOWORLD"));
    }

    private static String ReverseTheString(String s) {
        StringBuilder stringBuilder  = new StringBuilder(s);
        int left = 0, right = s.length() - 1;




        StringBuilder res = new StringBuilder(s);

        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }

//        StringBuffer stringBuffer = new StringBuffer(s);
//        while (left < right) {
//            char temp = stringBuffer.charAt(left);
//            stringBuffer.setCharAt(left, stringBuffer.charAt(right));
//            stringBuffer.setCharAt(right, temp);
//            left++;
//            right--;
//        }


       // StringBuilder was introduced in Java 5 specifically to replace StringBuffer for single-threaded use.
        // StringBuilder =>not synchronised no thread safe =>faster
        // StringBuffer => thread safe =>slower
        return res.toString();

    }



    static void reverseStringRec(char[] s, int l, int r) {
        if (l >= r)
            return;

        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        reverseStringRec(s, l + 1, r - 1);
    }


    static String reverseString(String s) {
        char[] arr = s.toCharArray();
        reverseStringRec(arr, 0, arr.length - 1);
        return new String(arr);
    }
}
