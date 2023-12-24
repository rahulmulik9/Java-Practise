package basic.b2_OPPS_Concepts.interface_;


class A {
    interface it1 //nested interface declared in A class
    {
        void add();
    }
};

class Test implements A.it1 {
    public void add() {
        System.out.println("add method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.add();
    }
};
