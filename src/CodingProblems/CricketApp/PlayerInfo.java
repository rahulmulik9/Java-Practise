package CodingProblems.CricketApp;

public class PlayerInfo {
    private String name;
    private int score;
    private int ballFaced;
    private int fourCount;
    private int sixCount;
    private int index;
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
        ballFaced = ballFaced++;
    }

    public void addRuns(int runs, boolean isFour, boolean isSix) {
        score = score + runs;
        if (isFour) fourCount = fourCount++;
        if (isSix) fourCount = sixCount++;
    }

    public void setOut(boolean out) {
        isOut = out;
    }

    //Constructor
    public PlayerInfo(int index, String name, boolean isOut) {
        this.index = index;
        this.name = name;
        this.isOut = isOut;
    }
}
