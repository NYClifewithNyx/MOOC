
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {

            System.out.println("Team: ");
            String team = scan.nextLine();
            int game = 0;
            int win = 0;
            int lose = 0;

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team)) {
                    game++;

                    if (homeScore > awayScore) {
                        win++;
                    } else {
                        lose++;
                    }

                } else if (awayTeam.equals(team)) {
                    game++;

                    if (awayScore > homeScore) {
                        win++;
                    } else {
                        lose++;
                    }

                }

            }

            System.out.println("Games: " + game);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);

        } catch (Exception e) {

            System.out.println("File " + file + " does not exist.");

        }

    }

}
