package basic.b4_interface;

interface it2 {
    void m1();

    interface it1 {
        void m2();
    }
};

class NestedInterface implements it2.it1 {
    public void m1() {
        System.out.println("m1 method");
    }

    public void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        NestedInterface t = new NestedInterface();
        t.m1();
        t.m2();
    }
};
