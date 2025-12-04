package CodingProblems.CricketApp;

public class ScoreBoardInfo {
    private final int totalOver;
    private int currentOver;
    private TeamInfo fristTeamInfo;
    private TeamInfo secondTeamInfo;

    public void setFirsInning(boolean firsInning) {
        this.firsInning = firsInning;
    }

    private boolean firsInning;

    public ScoreBoardInfo(int totalOver, int totalPlayer) {
        this.totalOver = totalOver;
        currentOver = 0;
        firsInning = true;
        fristTeamInfo = new TeamInfo(false, totalPlayer);
        secondTeamInfo = new TeamInfo(false, totalPlayer);
    }

    public int getTotalOver() {
        return totalOver;
    }


    public int getCurrentOver() {
        return currentOver;
    }

    public TeamInfo getFristTeamInfo() {
        return fristTeamInfo;
    }

    public TeamInfo getSecondTeamInfo() {
        return secondTeamInfo;
    }

    public void addRuns(int runs, boolean isFour, boolean isSix) {
        if (firsInning){
            fristTeamInfo.addRuns(runs);
        }else {
            secondTeamInfo.addRuns(runs);
        }
    }

    public void addBall() {
        if (firsInning){
            fristTeamInfo.addBall( );
        }else {
            secondTeamInfo.addBall();
        }

    }

    public boolean getWinner() {
        if (fristTeamInfo.getTotalScore() > secondTeamInfo.getTotalScore()) {
            return true;
        } else {
            return false;
        }
    }

    public void addExtra(int run) {
        if (firsInning){
            fristTeamInfo.addExtra( run);
        }else {
            secondTeamInfo.addExtra(run);
        }
    }
    public void changeStrike(){
        if (firsInning){
            fristTeamInfo.changeStrike(); ;
        }else {
            secondTeamInfo.changeStrike();
        }
    }

    public boolean addOver(){
        currentOver = currentOver+1;
        if(totalOver==currentOver){
            return true;
        }
        return false;
    }

    public void wicket(){
        if (firsInning){
             fristTeamInfo.wicketFallen();
        }else {
             secondTeamInfo.wicketFallen();
        }
    }
}
