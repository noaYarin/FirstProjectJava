import java.util.Date;
import java.util.ArrayList;

public class EmailMessage extends Message implements IDigital{
    private String priority="";
    private enum Priority {
        URGENT,
        REGULAR,
        GENERAL
    }
    private ArrayList<File> attachments;

    public EmailMessage() {
        this.priority = "";
    }

    public EmailMessage(String _senderName,String _content, Date _sendDate,String _priority) {
        super(_senderName, _content, _sendDate);
        this.priority = _priority;
        this.attachments = new ArrayList<File>();
    }

    public EmailMessage(String _senderName,String _content,String _priority) {
        super(_senderName, _content);
        this.attachments = new ArrayList<File>();
        this.priority=_priority;
    }

    public void addAttachment(File file){
       attachments.add(file);
    }

    public void removeAttachment(File file)throws AttachmentException{
       boolean isExist= attachments.remove(file);
       if(!isExist){
           throw new AttachmentException ("File not found");
       }
    }

    public void getPriorityValues(){
        int counter=1;
        for (Priority priorityOption : Priority.values()) {
            System.out.println(counter + " - " + priorityOption);
            counter++;
        }
    }

    public boolean isValidPriority(int number) {
        return number >= 1 && number <= Priority.values().length;
    }

    public void setPriority(int number) {
        this.priority = Priority.values()[number - 1].toString();
    }

    @Override
    public String getMessageType() {
        return "Email";
    }

    @Override
    public void ToString() {
        super.ToString();
        System.out.println( "Priority:" + priority + "\n");
    }

    @Override public void printCommunicationMethod(){
        System.out.println("Protocol - Internet");
    }
}