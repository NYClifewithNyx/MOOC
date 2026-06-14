
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integer = Integer.valueOf(scanner.nextLine());
        if (integer < 0) {
            integer = integer * (-1);
            System.out.print(integer);
        } else {
            System.out.print(integer);
        }
    }
}
