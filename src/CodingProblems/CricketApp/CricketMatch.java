package CodingProblems.CricketApp;

import java.util.Scanner;

public class CricketMatch {
    private ScoreBoardInfo scoreboard;
    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new CricketMatch().run();
    }

    private static int readPositiveInt() {
        Scanner s = new Scanner(System.in);
        int v = -1;
        while (v <= 0) {
            try {
                v = Integer.parseInt(s.next());
                if (v <= 0) System.out.print("Please enter a positive integer: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid. Enter a positive integer: ");
            }
        }
        return v;
    }
    private void run() {
        System.out.print("Enter Total overs: ");
        int overs = readPositiveInt();
        System.out.print("Enter Total players: ");
        int players = readPositiveInt();

        scoreboard = new ScoreBoardInfo(overs, players);

        System.out.println("\n=== First Innings ===");
        playInnings(scoreboard.getFirstTeam(), overs * 6);

        System.out.println("\nInning Break\n");

        System.out.println("=== Second Innings ===");
        playInnings(scoreboard.getSecondTeam(), overs * 6);

        System.out.println("\n=== Match Summary ===");
        System.out.println("-- Team 1 --");
        scoreboard.getFirstTeam().printTeamSummary();
        System.out.println();
        System.out.println("-- Team 2 --");
        scoreboard.getSecondTeam().printTeamSummary();
    }


    private void playInnings(TeamInfo team, int totalLegalBalls) {
        int legalBalls = 0;
        int ballInOver = 0;
        int overCount = 0;

        while (legalBalls < totalLegalBalls && !team.isAllOut()) {
            System.out.print("Enter a ball stat: ");
            String token = sc.next().trim();

            // wides
            if (token.toLowerCase().startsWith("wd")) {
                int extra = parseTrailingRuns(token.substring(2));
                int totalRuns = 1 + extra;
                team.addExtra(totalRuns);
                System.out.println("Wide! +" + totalRuns + " extras.");
                printCurrentScore(team);
                continue;
            }

            // no-balls
            if (token.toLowerCase().startsWith("nb")) {
                int extra = parseTrailingRuns(token.substring(2));
                int totalRuns = 1 + extra;
                team.addExtra(totalRuns);
                System.out.println("No-ball! +" + totalRuns + " extras.");
                printCurrentScore(team);
                // not a legal ball -> continue
                continue;
            }

            // legal deliveries
            if (token.equalsIgnoreCase("W")) {
                // capture out player id/name BEFORE changing indices

                team.addBallFaced();
                legalBalls++;
                ballInOver++;

                boolean continues = team.setWicketFallen();
                if (!continues) {
                    System.out.println("All out!");
                }
                printCurrentScore(team);
            } else {
                Integer runs = tryParseInt(token);
                if (runs == null || runs < 0 || runs > 6) {
                    System.out.println("Invalid input. Use numbers 0-6, W, wd, nb (wd1, nb2 etc allowed).");
                    continue;
                }

                team.addBallFaced();
                legalBalls++;
                ballInOver++;

                team.addRuns(runs);

                // rotate on odd runs
                if (runs % 2 == 1) {
                    team.rotateStrike();
                }

                printCurrentScore(team);
            }

            // end of over?
            if (ballInOver == 6) {
                overCount++;
                ballInOver = 0;
                team.rotateStrike();
                System.out.println("End of over " + overCount + ". Strike rotated.");
                System.out.println();
            }
        }

        System.out.println("Innings finished. Final:");
        printCurrentScore(team);
    }

    private static Integer tryParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    // parse trailing number after wd/nb: returns Integer.MIN_VALUE when empty/invalid
    private static int parseTrailingRuns(String s) {
        if (s == null || s.isEmpty()) return 0;
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return Integer.MIN_VALUE;
        }
    }

    private void printCurrentScore(TeamInfo team) {
        System.out.println("Current Score is : " + team.getTotalScore());
        System.out.println("Current wickets Fallen is : " + team.getWicketFallen());
    }
}
