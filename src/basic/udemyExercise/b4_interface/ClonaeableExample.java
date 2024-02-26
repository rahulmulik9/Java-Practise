package basic.udemyExercise.b4_interface;


class ClonaeableExample implements Cloneable {
    int a = 10, b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        ClonaeableExample t1 = new ClonaeableExample();//creates object of Test class
        ClonaeableExample t2 = (ClonaeableExample) t1.clone();//duplicate object of Test class
        System.out.println(t1.a);
        System.out.println(t1.b);
        t1.b = 555;
        t1.a = 444;
        System.out.println(t1.a);
        t1.b = 333;
        System.out.println(t1.a);
        System.out.println(t1.b);
//if we want initial values use duplicate object
        System.out.println(t2.a);//10
        System.out.println(t2.b);//20
    }
}
