package CodingProblems.CricketApp;

import java.util.ArrayList;

public class TeamInfo {
    private int totalScore;
    private int stickerIndex;
    private int nonStrikerIndex;
    private int nextPlayerIndex;
    private int wicketFallen;
    private ArrayList<PlayerInfo> thePlayerList;
    private int playerCount;

    public TeamInfo(int playerCount) {
        this.thePlayerList = new ArrayList<>();
        this.stickerIndex = 0;
        this.nonStrikerIndex = 0;
        this.nextPlayerIndex = 2;
        this.wicketFallen = 0;
        this.playerCount = playerCount;
        for (int i = 0; i < playerCount; i++) {
            thePlayerList.add(new PlayerInfo(i, "Player_" + i));
        }
    }

    public void addRuns(int runs) {
        thePlayerList.get(stickerIndex).addRunsScored(runs);
        totalScore = totalScore + runs;
    }

    public void addExtra(int runs) {
        totalScore = totalScore + runs;
    }

    public boolean setWicketFallen() {
        thePlayerList.get(stickerIndex).setBatmanOut();
        stickerIndex = nextPlayerIndex;
        nextPlayerIndex++;
        if (nextPlayerIndex > playerCount) {
            System.out.println("Inning end on :"+totalScore);
            return false;
        }
        return true;
    }

    public void addBallFaced() {
        thePlayerList.get(stickerIndex).addBallFaced();
    }
}
