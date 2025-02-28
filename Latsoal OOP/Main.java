import java.util.Scanner;

public class Main {
    // Declare Station
    MainMenu mainmenu;
    
    void ETC(){
        // Declare Scanner
        @SuppressWarnings("resource")
        Scanner ETC = new Scanner(System.in);
        // Process
        System.out.print("\nPress enter to continue...");
        ETC.nextLine();
    }

    // Process
    public Main() {
        mainmenu = new MainMenu();
        do {
            mainmenu.displayMainMenu();
            if (mainmenu.choice == 1) {
                mainmenu.RegisterNew();
                ETC();
            } else if (mainmenu.choice == 2) {
                mainmenu.ViewAllDocument();
                ETC();
            } else if (mainmenu.choice == 3) {
                mainmenu.ApproveDocument(); 
                ETC();
            } else {
                System.out.println("Thank you for using this application!");
            }
        } while(mainmenu.choice != 4);
    }

    public static void main(String[] args) {
        new Main();
    }
}
