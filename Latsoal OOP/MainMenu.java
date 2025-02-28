import java.util.*;

public class MainMenu {
    // Declare Station
    Integer choice;
    Integer memUsed = 0;
    ArrayList<Document> docs = new ArrayList<Document>();
    Integer size;
    String name;
    
    // Process
    // Display Main Menu
    void displayMainMenu() {
        // Declare Scanner
        Scanner scr = new Scanner(System.in);
        // Process
        System.out.println("Hov Document Manager");
        System.out.println("===================================");
        System.out.println("Available Storage: " + (1024-memUsed) + " MB / 1024 MB\n");
        System.out.println("1. Register New Document");
        System.out.println("2. View All Document");
        System.out.println("3. Approve Document");
        System.out.println("4. Exit");
        do{
            System.out.print(">> ");
            choice = scr.nextInt();
            
            if(choice < 1 || choice > 4) {
                System.out.println("Invalid Input");
            }
        } while(choice < 1 || choice > 4);
    }
    
    void RegisterNew() {
        // Declare Scanner
        Scanner scr = new Scanner(System.in);
        
        // Process
        System.out.println("Register New Document");
        System.out.println("===================================");
        System.out.print("Input Document name [1-50 characters]: ");
        name = scr.nextLine();
        System.out.print("Input Document size [1 - " + (1024-memUsed) + " MB]: ");
        
        // Size input 
        size = scr.nextInt();
        
        // Size Validation
        if(size < 1 || size > 1024-memUsed) {
            System.out.println("There is not enough storage space.");
        } else {
            Document docTemp = new Document(name, size);
            docTemp.status = "Draft";
            docs.add(docTemp);
            memUsed += size;
            System.out.println("Success input document data!");
        }
    }
    
    void ViewAllDocument() {
        Integer index = 1;
        System.out.println("View All Documents");
        System.out.println("===================================");
        if (docs.size() == 0) {
            System.out.println("There is no document.");
            return;
            
        }

        for(Document doc : docs) {
            // System.out.println(index + ". " + doc.name + " ( " + doc.size + " MB) - " + doc.status);
            // index++;
            if(index < 10){
                System.out.println("0" + index++ + ". " + doc.name + " ( " + doc.size + " MB) - " + doc.status);
            } else {
                System.out.println(index++ + ". " + doc.name + " ( " + doc.size + " MB) - " + doc.status);
            }
        }
    }

    void ApproveDocument() {
        // Declare Station
        Integer index = 1;
        Integer docNum = 0;
        // Declare Scanner
        Scanner scr = new Scanner(System.in);

        // Process
        System.out.println("Approve Document");
        System.out.println("===================================");

        if (docs.size() == 0) {
            System.out.println("There is no document to approve.");
            return;    
        }

        // Display Document
        for(Document doc : docs) {
            if(index < 10){
                System.out.println("0" + index + ". " + doc.name + " ( " + doc.size + " MB) - " + doc.status);
            } else {
                System.out.println(index + ". " + doc.name + " ( " + doc.size + " MB) - " + doc.status);
            }
            index++;
        }

        if (docs.size() > 1) {
            do{
                System.out.print("Input Document number to approve [1 - " + (index-1) + "]: ");
                docNum = scr.nextInt();
            } while (docNum < 1 || docNum > index-1); 
        } else {
            docNum = 1;
        }

        if(docs.get(docNum-1).status.equals("Draft")) {
            docs.get(docNum-1).status = "Approved";
            System.out.println("Success approve: " + docs.get(docNum-1).name + ".");
        } else {
            System.out.println("The document is already approved");
        }
    }
}
