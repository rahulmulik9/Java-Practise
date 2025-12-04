package CodingProblems.CricketApp;

public class PlayerInfo {
    private final String name;
    private final int index;
    private int score;
    private int ballFaced;
    private int fourCount;
    private int sixCount;
    private boolean isOut;

    public boolean isOut() {
        return isOut;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getBallFaced() {
        return ballFaced;
    }

    public int getFourCount() {
        return fourCount;
    }

    public int getSixCount() {
        return sixCount;
    }

    public void addBall() {
       ballFaced++;
    }

    public void addRuns(int runs) {
        score = score + runs;
        if (runs == 4)  fourCount++;
        if (runs == 6)  sixCount++;
    }

    public void setOut(boolean out) {
        isOut = out;
    }

    //Constructor
    public PlayerInfo(int index, String name, boolean isOut) {
        this.index = index;
        this.name = name;
        this.isOut = isOut;
        score = 0;
        ballFaced = 0;
        fourCount = 0;
        sixCount = 0;
    }
}
