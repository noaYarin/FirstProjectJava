import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add message");
            System.out.println("2. Print all messages");
            System.out.println("3. Delete message");
            System.out.println("4. Search message by word");
            System.out.println("5. Print all digital messages");
            System.out.println("6. Exit");
            System.out.print("Enter");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMessage(scanner);
                    break;
                    case 2:
                        printAllMessages();
                        break; case 3: deleteMessage(scanner);
                        break; case 4: searchMessages(scanner);
                        break; case 5: printDigitalMessages();
                        break; case 6: System.out.println("EXIT");
                        break; default: System.out.println("Enter again");
            }
        } while (choice != 6);
        scanner.close();
   }
}