import java.util.Scanner;
public class Menu {
    void Main(){
        System.out.println("Welcome to the ACTIVITIES Menu!");
        System.out.println("1. FISHING");
        System.out.println("2. HUNTING");
        System.out.println("3. CAMPING");
        System.out.println("3. FIGHTING");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an activity (1-4): ");	
        int choice = scanner.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please try again.");
            return;
        }
        if (choice == 1) {
            System.out.println("You chose Fishing.");
            System.out.println("Fishing is a great way to relax and enjoy nature.");
            return;
        } else if (choice == 2) {
            System.out.println("You chose Hunting.");
            System.out.println("Hunting is an exciting outdoor activity.");
            return;
        }else if (choice == 3) {
            System.out.println("You chose Camping.");
            System.out.println("Camping is a great way to enjoy nature and relax.");
            return;
        }
        else if (choice == 4) {
            System.out.println("Exiting...");
            return;
            
        }

    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.Main();
        System.out.println("Thank you for using the ACTIVITIES Menu!");
    }
}
