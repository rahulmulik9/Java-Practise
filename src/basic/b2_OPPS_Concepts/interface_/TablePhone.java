package basic.b2_OPPS_Concepts.interface_;

public class TablePhone implements Phone{
    private int myNumber;
    private boolean isRinging;

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

    public TablePhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void makeCall(int numbner) {
        this.isRinging = true;
    }

    @Override
    public void makeRing() {
        System.out.println("Ringing phone");
    }



}
