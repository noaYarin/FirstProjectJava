import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main{
    static ArrayList<Message> messages = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
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
                    //deleteMessage();
                    break;
                case 4:
                    //searchMessagesByword();
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

    private static void printDigitalMessages() {
        for (Message msg : messages){
            if (msg instanceof EmailMessage || msg instanceof WhatsApp) {
                System.out.println(msg);
            }
        }
    }


    private static void addMessage() {
        System.out.println("Enter sender name");
        String senderName = scanner.nextLine();
        System.out.println("Enter content");
        String content = scanner.nextLine();
        System.out.println("Enter message type");
        System.out.println("1 - Email, 2 - Whatsapp, 3- Board");
        int type = scanner.nextInt();
        scanner.nextLine();
        switch (type) {
            case 1:
                System.out.println("Choose priority from this list");
                System.out.println(" 1 - URGENT 2 - REGULAR 3 - GENERAL");
                String priority = scanner.nextLine();
                EmailMessage emailMsg = new EmailMessage(senderName,content,new Date(),priority);
                messages.add(emailMsg);
                break;
            case 2:
                System.out.println("Enter recipient name");
                String recipient = scanner.nextLine();
                WhatsApp whatsAppMsg = new WhatsApp(senderName,content,new Date(),false,recipient);
                messages.add(whatsAppMsg);
                break;
            case 3:
                System.out.println("Enter subject name");
                String subject = scanner.nextLine();
                BoardMessage boardMsg = new BoardMessage(senderName,content,new Date(),false,subject);
                messages.add(boardMsg);
                break;
        }
    }


    //private void deleteMessage(){}

    //private void searchMessagesByword(){}

    private static void printAllMessages(){
            for (Message msg : messages){
                    System.out.println(msg);
            }
    }
}