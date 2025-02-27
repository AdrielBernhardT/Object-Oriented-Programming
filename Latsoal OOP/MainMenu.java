import java.util.*;

public class MainMenu {
// Declare Station
    public Integer choice;

// Process
    // Display Main Menu
    public void displayMainMenu() {
        System.out.println("Hov Document Manager");
        System.out.println("===================================");
        System.out.println("Available Storage: ... MB / 1024 MB\n");
        System.out.println("1. Register New Document");
        System.out.println("2. View All Document");
        System.out.println("3. Approve Document");
        System.out.println("4. Exit");
        do{
            System.out.print(">> ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if(choice < 1 || choice > 4) {
                System.out.println("Invalid Input");
            }
        } while(choice < 1 || choice > 4);
    }

    public void RegisterNew() {
        
    }

    public void ViewAllDocument() {
        
    }

    public void ApproveDocument() {
        
    }
}
