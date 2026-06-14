
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        float average = 0; 
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
           
            if (number == 0) {
                
                if (sum <= 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                
                System.out.print(average);
                break;                                
            }          
            
            if (number >= 0) {
                sum += number;
                count++;
                average = (float) sum / count;    
            }
            
                        
        }
             
    }
        
}
