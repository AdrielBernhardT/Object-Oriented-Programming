public class Main {
    // Declare Station
    MainMenu mainmenu;
    
    // Process
    public Main() {
        // Soal no 2
        mainmenu = new MainMenu();
        do {
            mainmenu.displayMainMenu();
            if (mainmenu.choice == 1) {
                mainmenu.RegisterNew();
            } else if (mainmenu.choice == 2) {
                mainmenu.ViewAllDocument();
            } else if (mainmenu.choice == 3) {
                mainmenu.ApproveDocument(); 
            }
        } while(mainmenu.choice != 4);
    }

    public static void main(String[] args) {
        new Main();
    }
}
