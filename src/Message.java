import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public abstract class Message {
    private String sender="";
    private String content="";
    private Date sendDate;

    public Message(String _senderName,String _content, Date _sendDate){
        setSender(_senderName);
        setContent(_content);
        setSendDate(_sendDate);
    }

    public Message(String _senderName,String _content){
        this.sendDate=Date.from(new Date().toInstant());
        setSender(_senderName);
        setContent(_content);
    }

    public void setSender(String senderName) throws IllegalArgumentException {
        if(senderName == null || senderName.isEmpty()){
            throw new IllegalArgumentException ("Empty or null sender name");
        }
       sender = senderName;
    }

    public void setContent(String _content) {
        if (_content == null || _content.isEmpty()) {
            throw new IllegalArgumentException ("Empty or null content");
        }
        content = _content;
    }

    public void setSendDate(Date sendDate){
        this.sendDate=sendDate;
    }

    public String getContent() {
        return content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public String getSender() {
        return sender;
    }

    public boolean find(String[] words){
        for (String word : words) {
            if (content.toLowerCase().contains(word.toLowerCase())) return true;
        }
        return false;
    }

    public String shortContent() {
        if (content.length() <= 20) {
            return content;
        }
        return content.substring(0, 20) + "...";
    }

    public abstract String getMessageType();

    @Override
    public String toString() {
        return "Sender:" + sender + "\n" +
                "Content:" + content + "\n" +
                "Date Sent:" + sendDate + "\n";
    }
}
