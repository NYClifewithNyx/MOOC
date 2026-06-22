
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        int longest = 0;
        String name = "";
        int count = 0;

        while (true) {

            String nameYear = scanner.nextLine();

            if (nameYear.equals("")) {
                break;
            }

            String[] splits = nameYear.split(",");

            year += Integer.valueOf(splits[1]);
            count++;

            if (longest < splits[0].length()) {

                longest = splits[0].length();
                name = splits[0];

            }

        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth year: " + ((float) year / count));

    }
}
