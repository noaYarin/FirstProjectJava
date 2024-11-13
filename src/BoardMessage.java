import java.util.Date;

public abstract class BoardMessage extends Message {
    private String priority="";
    private boolean isActive=false;

    enum priority {
        URGENT,
        REGULAR
    }
    public BoardMessage(String _senderName,String _content, Date _sendDate,boolean _isActive,String _priority) {
        super(_senderName,_content,_sendDate);
        this.isActive=_isActive;
        this.priority=_priority;
    }

    public BoardMessage(String _senderName,String _content,boolean _isActive,String _priority) {
        super(_senderName,_content);
        this.isActive=_isActive;
        this.priority=_priority;
    }

    @Override
    public String toString() {
        super.toString();
        return "Active:" + (isActive ?"Yes" : "No")+ "\n";
    }
}