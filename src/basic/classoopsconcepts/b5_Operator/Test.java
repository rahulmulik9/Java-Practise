package basic.classoopsconcepts.b5_Operator;

class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = t1;
        System.out.println(t1 == t2); //false
        System.out.println(t1 == t3); //true
        String str1 = "ratan";
        String str2 = "ratan";
        System.out.println(str1 == str2); //true
        String s1 = new String("anu");
        String s2 = new String("anu");
        System.out.println(s1 == s2); //false
        StringBuffer sb1 = new StringBuffer("sravya");
        StringBuffer sb2 = new StringBuffer("sravya");
        System.out.println(sb1 == sb2); //flase
    }
}
