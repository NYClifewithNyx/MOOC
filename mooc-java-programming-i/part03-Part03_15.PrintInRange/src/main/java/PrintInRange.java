
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here.
        
        Scanner scanner = new Scanner(System.in);
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Hi, please input your number and enter: ");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                System.out.println("Thank you. Series collected.");
                break;
            }
            
            numbers.add(input);
            System.out.println("Thank you. Next number? (Note: 0 will close this input)");
            
        }
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
               
        
    }
        
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        
        for (Integer number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
        
    }
    
}
