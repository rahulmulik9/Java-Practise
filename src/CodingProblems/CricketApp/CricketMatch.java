package CodingProblems.CricketApp;

import java.util.Scanner;

//write code
public class CricketMatch {
    ScoreBoardInfo currentMatch;
    boolean firstInning = true;
    int totalBalls = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int overs, players;
        System.out.print("Enter Total overs");
        overs = sc.nextInt();
        System.out.print("Enter Total players");
        players = sc.nextInt();

        CricketMatch match = new CricketMatch();
        for (int i = 0; i < 2; i++) {
            match.PlayMatch(overs, players);
        }
    }

    public void PlayMatch(int overs, int players) {

        currentMatch = new ScoreBoardInfo(overs, players);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < overs * 6; i++) {
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
                    totalBalls = totalBalls + 1;
                    int runs = Integer.parseInt(word);
                    currentMatch.addBall();
                    currentMatch.addRuns(runs, false, false);

                    if (runs % 2 != 0) {
                        currentMatch.changeStrike();
                    }
                    getCurrentRunStat(currentMatch);
                    System.out.println("Inning Break");

                    if (totalBalls % 6 == 0) {
                        currentMatch.changeStrike();
                        if (currentMatch.addOver()) {
                            System.out.println("Inning Break");
                            firstInning = false;
                        }
                    }

                    break;
                case "W":
                    currentMatch.addBall();
                    currentMatch.wicket();
                    totalBalls = totalBalls + 1;
                    getCurrentWicketStat(currentMatch);
                    break;
                default:
                    System.out.println("Invalid Input ");
            }
        }
    }

    private void getCurrentWicketStat(ScoreBoardInfo currentMatch) {

        if (firstInning){
            PlayerInfo fallenWicketInfo =  currentMatch.getFristTeamInfo().getFallenWicketInfo();
            PlayerInfo currentWicket = currentMatch.getFristTeamInfo().getNextPlayerInfo();
            System.out.println(fallenWicketInfo.getName() + " is out on :"+fallenWicketInfo.getScore());
            System.out.println("Next player is"+ currentWicket.getName());
        }else {
            PlayerInfo fallenWicketInfo =  currentMatch.getSecondTeamInfo().getFallenWicketInfo();
            PlayerInfo currentWicket = currentMatch.getSecondTeamInfo().getNextPlayerInfo();
            System.out.println(fallenWicketInfo.getName() + " is out on :"+fallenWicketInfo.getScore());
            System.out.println("Next player is"+ currentWicket.getName());
        }
    }

    private void getCurrentRunStat(ScoreBoardInfo currentMatch) {
        if (firstInning) {
            int score = currentMatch.getFristTeamInfo().getScore();
            int wicketFallen = currentMatch.getFristTeamInfo().getNextPlayerIndex() - 1;
            System.out.println("Current Score is : " + ": " + score);
            System.out.println("Current wicket Fallen is : " + ": " + wicketFallen);
        } else {
            int score = currentMatch.getSecondTeamInfo().getScore();
            int wicketFallen = currentMatch.getSecondTeamInfo().getNextPlayerIndex() - 1;
            System.out.println("Current Score is : " + ": " + score);
            System.out.println("Current wicket Fallen is : " + ": " + wicketFallen);
        }
    }
}
