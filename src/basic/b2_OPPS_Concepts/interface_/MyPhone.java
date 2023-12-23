package basic.b2_OPPS_Concepts.interface_;

public class MyPhone implements Phone,Table{
    @Override
    public void makeCall(int number) {
        System.out.println("This class implement both Phone and Table using "+number);
    }

    @Override
    public void makeRing() {

    }

    @Override
    public void isTable() {

    }
}
