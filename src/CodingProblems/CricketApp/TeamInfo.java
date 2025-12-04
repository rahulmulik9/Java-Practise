package CodingProblems.CricketApp;

import java.util.ArrayList;

public class TeamInfo {
    private int playerCount;
    private int score;
    private int nextPlayerIndex;
    private int strikerIndex;
    private int nonStrikerIndex;
    private boolean isAllOut;
    private ArrayList<PlayerInfo> playerList;
    private int extraScore;

    public TeamInfo(boolean isAllOut, int playerCount) {
        this.isAllOut = isAllOut;
        this.playerCount = playerCount;

        for (int i = 0; i < playerCount; i++) {
            PlayerInfo newPlayer = new PlayerInfo(i, ("Player"+1),false);
            assert false;
            playerList.add(newPlayer);
        }
    }

    public int getScore() {
        return score;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public int getStrikerIndex() {
        return strikerIndex;
    }

    public int getNonStrikerIndex() {
        return nonStrikerIndex;
    }

    public boolean isAllOut() {
        return isAllOut;
    }

    public void addRuns(int runs, boolean isFour, boolean isSix) {
        score = score + runs;
        if (runs==4)isFour = true;
        if (runs==6)isSix = true;
        playerList.get(strikerIndex).addRuns(runs,isFour,isSix);
    }

    public void wicket() {
        nextPlayerIndex = nextPlayerIndex++;
        if (nextPlayerIndex > playerCount) isAllOut = true;
    }

    public void changeStricke() {
        int temp = strikerIndex;
        strikerIndex = nonStrikerIndex;
        nonStrikerIndex = temp;
    }

    public void addExtra(int run){
        score = score + run;
        extraScore = extraScore+run;
    }
}
