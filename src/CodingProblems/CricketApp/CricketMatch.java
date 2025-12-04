package CodingProblems.CricketApp;

import java.util.Scanner;

//write code
public class CricketMatch {
    ScoreBoardInfo currentMatch;

    public void PlayMatch(int overs, int players) {
        int totalBalls = 0;
        currentMatch = new ScoreBoardInfo(overs, players);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < overs * 6; i++) {
            System.out.print("Enter a ball stat ");
            String word = sc.next();
            switch (word) {
                case "WD":
                case "NB":
                case "W":
                  currentMatch.addExtra(1);
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "6":
                    totalBalls++;
                    int runs = Integer.parseInt(word);
                    currentMatch.addRuns(runs,false,false);

                    if (runs % 2 != 0) {
                        currentMatch.changeStrike();
                    }

                    if(totalBalls % 6 == 0){
                        currentMatch.changeStrike();
                        if(currentMatch.addOver()){
                            System.out.println("Inning Break");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Input ");
            }
        }
    }
}
