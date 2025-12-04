package CodingProblems.CricketApp;

import java.util.ArrayList;

public class TeamInfo {
    private ArrayList<PlayerInfo> playerList;
    private int totalPlayer;
    private int score;
    private int extraScore;
    private int numberOfWicketFallen;
    private int nextPlayerIndex;
    private int strikerIndex;
    private int nonStrikerIndex;
    public TeamInfo(boolean isAllOut, int playerCount) {
        playerList = new ArrayList<>();
        totalPlayer = playerCount;
        nextPlayerIndex = 2;
        numberOfWicketFallen = 0;
        for (int i = 0; i < playerCount; i++) {
            PlayerInfo newPlayer = new PlayerInfo(i, ("Player"+i),false);
            playerList.add(newPlayer);
        }
    }
}
