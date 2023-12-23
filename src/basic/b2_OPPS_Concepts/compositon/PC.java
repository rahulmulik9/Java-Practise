package basic.b2_OPPS_Concepts.compositon;

public class PC {
/*          Case  => Dimension
   Pc =>  Monitor => Resolution
          Motherborad
          */


    private MotherBoard m_motherBoard;
    private Case m_case;
    private Monitor m_monitor;

    public PC(MotherBoard m_motherBoard, Case m_case, Monitor m_monitor) {
        this.m_motherBoard = m_motherBoard;
        this.m_case = m_case;
        this.m_monitor = m_monitor;
    }

    public Case getM_case() {
        return m_case;
    }

    public Monitor getM_monitor() {
        return m_monitor;
    }

    public MotherBoard getM_motherBoard() {
        return m_motherBoard;
    }

    public void getCall(){
        System.out.println("calling pc method");
    }
}
