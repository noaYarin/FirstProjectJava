import java.util.Date;
import java.util.ArrayList;

public class EmailMessage extends Message implements IDigital{
    private String priority="";
    enum priority {
        URGENT,
        REGULAR,
        GENERAL
    }
    private ArrayList<File> attachments;

    public EmailMessage(String _senderName,String _content, Date _sendDate,String _priority) {
        super(_senderName,_content,_sendDate);
        this.priority=_priority;
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

    @Override
    public String getMessageType() {
        return "Its an Email Message";
    }

    @Override
    public String toString() {
        super.toString();
        return "Subject:" + priority + "\n";
    }
}