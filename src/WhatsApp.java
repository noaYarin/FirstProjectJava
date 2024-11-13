import java.util.Date;
public abstract class WhatsApp extends Message{

    private String recipient="";
    private boolean isSeen=false;

        public WhatsApp(String _senderName, String _content, Date _sendDate,boolean _isSeen,String _recipient) {
            super(_senderName,_content,_sendDate);
            setRecipient(_recipient);
            this.isSeen=_isSeen;
        }

    private void setRecipient(String recipient) throws EmptyException{
        if(recipient == null || recipient.isEmpty()){
            throw new EmptyException ("Empty or null recipient");
        }
    }

    private String getRecipient(){
            return recipient;
    }

    private boolean getIsSeen(){
        return isSeen;
    }

    @Override
    public String toString() {
        return "Recipient:" + recipient + "\n" +
                "Seen:" + (isSeen ?"Yes" : "No")+ "\n";
    }
}
