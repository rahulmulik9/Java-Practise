package CodingProblems.CricketApp;

import java.util.Scanner;

//write code

public class CricketMatch {
    ScoreBoardInfo currentMatch;
    boolean firstInning = true;
    int firsTeamScore = 0;
    int secondTeamScore = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int overs, players;
        System.out.print("Enter Total overs");
        overs = sc.nextInt();
        System.out.print("Enter Total players");
        players = sc.nextInt();

        CricketMatch match = new CricketMatch();
        match.startGame(match,overs,players);


    }

    public void startGame(CricketMatch match,int overs,int players) {
        currentMatch = new ScoreBoardInfo(overs, players);
        System.out.println("=== First Inning ===");
        match.PlayMatch(overs, players);
        System.out.println("=== Second Inning ===");
        match.PlayMatch(overs, players);
        match.getWinner();
    }

    public void getWinner() {
        if (firsTeamScore > secondTeamScore) {
            System.out.println("First team won by : " + (firsTeamScore - secondTeamScore));
        } else {
            System.out.println("Second team won by : " + (secondTeamScore - firsTeamScore));
        }
    }

    public void PlayMatch(int overs, int players) {
        int totalBall = 0;

        Scanner sc = new Scanner(System.in);
        while (totalBall < (overs * 6)) {
            System.out.print("Enter a ball stat ");
            String word = sc.next();
            word = word.toUpperCase();
            switch (word) {
                case "WD":
                case "NB":
                    currentMatch.addExtra(1);
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "6":
                    totalBall++;
                    int runs = Integer.parseInt(word);
                    currentMatch.addBall();
                    currentMatch.addRuns(runs, false, false);
                    if (runs % 2 != 0) {
                        currentMatch.changeStrike();
                    }


                    if (totalBall % 6 == 0) {
                        currentMatch.changeStrike();
                        printTotalScore(currentMatch);
                        if (currentMatch.addOver()) {
                            totalBall = (overs + 1) * 6;
                            System.out.println("Inning Break");
                            currentMatch.setFirsInning(false);
                            firstInning = false;
                        }
                    }

                    break;
                case "W":
                    currentMatch.addBall();
                    currentMatch.wicket();
                    if (getTotalWicketFallen(players)) {
                        totalBall = (overs + 1) * 6;
                        printTotalScore(currentMatch);
                        currentMatch.setFirsInning(false);
                        System.out.println("Inning Break");
                    } else {
                        totalBall++;
                    }
                    break;
                default:
                    System.out.println("Invalid Input ");
            }
        }

    }

    public void saveScore(ScoreBoardInfo scoreBoardInfo) {
        if (firstInning) {
            firsTeamScore = scoreBoardInfo.getFristTeamInfo().getTotalScore();
        } else {
            secondTeamScore = scoreBoardInfo.getSecondTeamInfo().getTotalScore();
        }
    }

    public void printTotalScore(ScoreBoardInfo currentMatch) {
        TeamInfo team;
        if (firstInning) {
            team = currentMatch.getFristTeamInfo();
        } else {
            team = currentMatch.getSecondTeamInfo();
        }
        System.out.println("Team one is " + " :" + team.getTotalScore() + "\\" + team.getTotalWicketFallen());
    }

    public boolean getTotalWicketFallen(int players) {
        TeamInfo team;
        if (firstInning) {
            team = currentMatch.getFristTeamInfo();
        } else {
            team = currentMatch.getSecondTeamInfo();
        }
        return team.getTotalWicketFallen() == players-1;
    }


}
