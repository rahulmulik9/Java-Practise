package basic.b5_Operator;

class DifferanceBetween {
    DifferanceBetween(String str) {
    }

    public static void main(String[] args) {
        DifferanceBetween t1 = new DifferanceBetween("ratan");
        DifferanceBetween t2 = new DifferanceBetween("ratan");
        System.out.println(t1 == t2); //reference comparison false
        System.out.println(t1.equals(t2)); //reference comparison false
        String str1 = "anu";
        String str2 = "anu";
        System.out.println(str1 == str2); //reference comparison true
        System.out.println(str1.equals(str2)); //content comparison true
        String str3 = new String("Sravya");
        String str4 = new String("Sravya");
        System.out.println(str3 == str4); //reference comparison false
        System.out.println(str3.equals(str4)); //content comparison true
        StringBuffer sb1 = new StringBuffer("students");
        StringBuffer sb2 = new StringBuffer("students");
        System.out.println(sb1 == sb2); //reference comparison false
        System.out.println(sb1.equals(sb2)); //reference comparison false
    }
}

