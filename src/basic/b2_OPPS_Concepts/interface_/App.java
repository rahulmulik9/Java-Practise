package basic.b2_OPPS_Concepts.interface_;

public class App {
    public static void main(String[] args) {
        TablePhone t1 = new TablePhone(87931, false);
        Mobile m1 = new Mobile(78457, true);
        MyPhone myp = new MyPhone();

        t1.makeCall(1547);
        t1.makeRing();
        System.out.println(t1.isRinging());

        m1.makeCall(5565);
        m1.makeRing();
        System.out.println(m1.isRinging());

        myp.makeCall(4477);

        //Object of interface is not possible
        //here it look like we are creating object,
        //but actually we are implementing class and override method
        Table t3=new Table() {
            @Override
            public void isTable() {
                System.out.println("Yes it is possible");
            }
        };

        t3.isTable();
    }
}
