package CodingProblems.CricketApp;

public class ScoreBoardInfo {
    private int totalOver;
    private int score;
    private int currentOver;
    private TeamInfo fristTeamInfo;
    private TeamInfo secondTeamInfo;
    private boolean firsInning;

    public ScoreBoardInfo(int totalOver, int totalPlayer) {
        this.totalOver = totalOver;
        this.score = 0;
        currentOver = 0;
        firsInning = true;
        fristTeamInfo = new TeamInfo(false, totalPlayer);
        secondTeamInfo = new TeamInfo(false, totalPlayer);
    }

    public int getTotalOver() {
        return totalOver;
    }

    public int getScore() {
        return score;
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

    public void setFirsInning(boolean firsInning) {
        this.firsInning = firsInning;
    }

    public void addRuns(int runs, boolean isFour, boolean isSix) {
        if (firsInning){
            fristTeamInfo.addRuns( runs, isFour,isSix);
        }else {
            secondTeamInfo.addRuns( runs, isFour,isSix);
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
        if (fristTeamInfo.getScore() > secondTeamInfo.getScore()) {
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
            fristTeamInfo.changeStricke() ;
        }else {
            secondTeamInfo.changeStricke();
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
            fristTeamInfo.wicket(); ;
        }else {
            secondTeamInfo.wicket();
        }
    }
}
