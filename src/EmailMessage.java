import java.util.Date;
import java.util.ArrayList;

public abstract class EmailMessage extends Message implements IDigital{
    private String subject="";
    private ArrayList<File> attachments;

    public EmailMessage(String _senderName,String _content, Date _sendDate,String subject) {
        super(_senderName,_content,_sendDate);
        this.subject=subject;
        this.attachments = new ArrayList<File>();
    }

    public EmailMessage(String _senderName,String _content,String subject) {
        super(_senderName, _content);
        this.subject = subject;
        this.attachments = new ArrayList<File>();
    }

    public void setSubject(String _subject) {
        if(subject == null || subject.isEmpty()){
            throw new IllegalArgumentException ("Empty or null subject");
        }
        subject = _subject;
    }

    public String getSubject(String subject) {
        return subject;
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
    public String toString() {
        super.toString();
        return "Subject:" + subject + "\n";
    }
}