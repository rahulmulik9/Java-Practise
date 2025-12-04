package CodingProblems.CricketApp;

import java.util.ArrayList;

public class TeamInfo {
    private ArrayList<PlayerInfo> playerList;
    private int totalScore;
    private int extraScore;
    private int numberOfWicketFallen;
    private int nextPlayerIndex;
    private int strikerIndex;
    private int nonStrikerIndex;
    private int totalWicketFallen;

    public int getTotalScore() {
        return totalScore;
    }

    public int getExtraScore() {
        return extraScore;
    }

    public TeamInfo(boolean isAllOut, int playerCount) {
        playerList = new ArrayList<>();
        nextPlayerIndex = 2;
        numberOfWicketFallen = 0;
        strikerIndex = 0;
        nonStrikerIndex = 1;
        totalScore = 0;
        for (int i = 0; i < playerCount; i++) {
            PlayerInfo newPlayer = new PlayerInfo(i, ("Player" + i), false);
            playerList.add(newPlayer);
        }
    }

    public int getTotalWicketFallen(){
        return numberOfWicketFallen;
    }
    public void wicketFallen() {
        numberOfWicketFallen++;
        PlayerInfo wicketPlayer = playerList.get(strikerIndex);
        wicketPlayer.setOut(true);
        printPlayerInfo(wicketPlayer);
        strikerIndex = nextPlayerIndex;
        nextPlayerIndex++;
    }

    public void addRuns(int runs) {
        totalScore = totalScore + runs;
        playerList.get(strikerIndex).addRuns(runs);
    }

    public void changeStrike() {
        int tempIndex = strikerIndex;
        strikerIndex = nextPlayerIndex;
        nonStrikerIndex = tempIndex;
    }

    public void addExtra(int runs) {
        totalScore = totalScore + runs;
        extraScore = extraScore + runs;
    }

    public void addBall() {
        PlayerInfo currentPlayer = playerList.get(strikerIndex);
        currentPlayer.addBall();
    }

    public void printPlayerInfo(PlayerInfo playerInfo) {
        System.out.println(playerInfo.getName() + " wicket fallen on " + ":" + playerInfo.getScore());
        System.out.println("Ball faced :" + playerInfo.getBallFaced() + "," + " 6s :" + playerInfo.getSixCount() + "," + " 4s :" + playerInfo.getFourCount());
    }
}
