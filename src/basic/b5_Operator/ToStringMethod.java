package basic.b5_Operator;


class ToStringMethod {
    public static void main(String[] args) { //object class toString() executed
        ToStringMethod t = new ToStringMethod();
        System.out.println(t);
        System.out.println(t.toString());
//String class toString() executed
        String str = "ratan";
        System.out.println(str);
        System.out.println(str.toString());
//StringBuffer class toString() executed
        StringBuffer sb = new StringBuffer("anu");
        System.out.println(sb);
        System.out.println(sb.toString());
    }
};



