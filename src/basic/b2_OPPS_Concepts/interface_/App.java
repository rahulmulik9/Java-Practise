package basic.b2_OPPS_Concepts.interface_;

public class App {
    public static void main(String[] args) {
        TablePhone t1=new TablePhone(87931,false);
        Mobile m1=new Mobile(78457,true);

        t1.makeCall(1547);
        t1.makeRing();
        System.out.println(t1.isRinging());

        m1.makeCall(5565);
        m1.makeRing();
        System.out.println(m1.isRinging());
    }
}
