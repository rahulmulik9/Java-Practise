package CodingProblems.CricketApp;

public class ScoreBoardInfo {
    private TeamInfo firstTeam;
    private TeamInfo secondTeam;
    private int leagalBall;
    private int overs;
    private int totalPlayers;

    public ScoreBoardInfo(int overs, int totalPlayers) {
        firstTeam = new TeamInfo(totalPlayers);
        secondTeam = new TeamInfo(totalPlayers);
        leagalBall = 0;
        this.overs = overs;
        this.totalPlayers = totalPlayers;
    }

    public TeamInfo getFirstTeam() {
        return firstTeam;
    }

    public TeamInfo getSecondTeam() {
        return secondTeam;
    }

}
