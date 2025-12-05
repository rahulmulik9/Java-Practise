package CodingProblems.CricketApp;

public class PlayerInfo {
    private final int rank;
    private final String name;
    private int four;
    private int six;
    private int totalRuns;
    private boolean isOut;
    private int ballFaced;

    public PlayerInfo(int rank, String playerName) {
        this.rank = rank;
        this.name = playerName;
        this.four = 0;
        this.six = 0;
        this.totalRuns = 0;
        this.ballFaced = 0;
        this.isOut = false;
    }

    public void addBallFaced(){
        ballFaced ++;
    }

    public void addRunsScored(int runs){
        if(runs == 4)four++;
        if(runs == 6)six++;
        totalRuns = runs+totalRuns;
    }

    public void setBatmanOut(){
        isOut = true;
    }

    public void printScore() {
        System.out.println(name + " score runs :" + totalRuns + " in " + ballFaced + " balls.");
        System.out.println("Six : " + six + " Four : " + four);
    }
}
