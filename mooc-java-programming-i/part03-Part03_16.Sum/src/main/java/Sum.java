
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Please enter your numbers: (Note: 0 will end the input)");
        
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                System.out.println("End of the input");
                break;
            }
            
            numbers.add(input);
        
        }
        
        //System.out.println("Now the sum of the inputs are:");
        System.out.println(sum(numbers));
        
        
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        
        int sum = 0;
        
        for (int number : numbers) {
            
            sum += number;    
                        
        }
        
        return sum;
        
    }

}
