import java.util.Date;

public class BoardMessage extends Message {
    private String subject="";
    private boolean isNew=false;

    public BoardMessage(String _senderName,String _content, Date _sendDate,boolean _isNew,String _subject) {
        super(_senderName,_content,_sendDate);
        this.isNew=_isNew;
        this.subject=_subject;
    }

    public BoardMessage(String _senderName,String _content,boolean _isNew,String _subject) {
        super(_senderName,_content);
        this.isNew=_isNew;
        this.subject=_subject;
    }

    public String getSubject(String subject) {
        return subject;
    }

    public void setSubject(String _subject) {
        if(subject == null || subject.isEmpty()){
            throw new IllegalArgumentException ("Empty or null subject");
        }
        subject = _subject;
    }

    @Override
    public String getMessageType() {
        return "Board Message";
    }

    @Override
    public void ToString() {
        super.ToString();
        System.out.println("New Board Message:" + (isNew ?"Yes" : "No")+ "\n" +"Subject: "+ subject+"\n");
    }
}