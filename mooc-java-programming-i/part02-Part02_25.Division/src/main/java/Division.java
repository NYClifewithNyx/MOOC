import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        System.out.println("Input your first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Input your second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
                
        division(number1, number2);
        
    }

    // implement the method here
    
    public static void division(int number1, int number2) {
        
        System.out.println((double) number1 / number2);
     
    }
    
}
