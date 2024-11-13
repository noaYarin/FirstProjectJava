import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private ArrayList<Message> messages = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add message");
            System.out.println("2. Print all messages");
            System.out.println("3. Delete message");
            System.out.println("4. Search message by word");
            System.out.println("5. Print all digital messages");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMessage();
                    break;
                case 2:
                    printAllMessages();
                    break;
                case 3:
                    deleteMessage();
                    break;
                case 4:
                    searchMessagesByword();
                    break;
                case 5:
                    printDigitalMessages();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    private void addMessage() {
        System.out.println("Enter message type");
        System.out.println("1 - Email, 2 - Whatsapp");
        int type = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter message content: ");
        String content = scanner.nextLine();
        switch(type)
        {
            case 1 :

                break;

            case 2:
                break;
        }

    private void printAllMessages(){}

    private void deleteMessage(){}

    private void searchMessagesByword(){}

    private void printDigitalMessages(){}
}