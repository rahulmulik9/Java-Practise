package Challenge75.Day34;

/*PROBLEM STATEMENT
* Given a binary string s without leading zeros, return true if s contains at most one contiguous segment of ones. Otherwise, return false.
Example 1:

Input: s = "1001"
Output: false
Explanation: The ones do not form a contiguous segment.
Example 2:

Input: s = "110"
Output: true*/
public class ContiniousSegment {
    public static void main(String[] args) {
        String first = "1001";
        String second = "10110";
        String third = "1";
        System.out.println(new ContinousSol().isContiniousOne(first));
        System.out.println(new ContinousSol().isContiniousOne(second));
        System.out.println(new ContinousSol().isContiniousOne(third));
    }
}

class ContinousSol{
    public boolean isContiniousOne(String s){
//        char[] arr = s.toCharArray();
//
//        if(arr.length==0)return false;
//        if(arr.length==1 && arr[0]=='1'){
//            return true;
//        }
//        if(arr.length==2){
//            if (arr[0]=='1' || arr[1]=='1'){
//            return true;}
//        }
//        for (int i = 1; i <arr.length ; i++) {
//            if( arr[i]=='1' && arr[i]==arr[i-1] ){
//                return true;
//            }
//        }
//        return false;
        return !s.contains("01");
    }
}