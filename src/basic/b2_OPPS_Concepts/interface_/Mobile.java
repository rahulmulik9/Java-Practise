package basic.b2_OPPS_Concepts.interface_;

public class Mobile implements Phone{

    private int myNumber;
    private boolean isRinging;

    public Mobile(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public boolean isRinging() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }
    @Override
    public void makeCall(int number) {
        this.isRinging = false;
    }

    @Override
    public void makeRing() {
        System.out.println("Cant not reach at the moment");

    }
}
