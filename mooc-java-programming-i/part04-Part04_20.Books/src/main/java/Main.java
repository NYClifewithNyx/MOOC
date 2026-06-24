
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(title, page, year));

        }
        
        System.out.println("What information wil be printed? ");
        String search = scanner.nextLine();
        
        if (search.equals("name")) {
            
            for (Book value : bookList) {
                
                System.out.println(value.getName());
                
            }
            
        } else if (search.equals("everything")) {
        
            for (Book value : bookList) {
                
                System.out.println(value);
                
            }
            
    }
         

    }
}
