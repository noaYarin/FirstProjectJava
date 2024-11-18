import java.util.Date;
public class WhatsApp extends Message implements IDigital{

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
    public String getMessageType() {
        return "WhatsApp";
    }

    @Override
    public void ToString() {
        super.ToString();
        System.out.println( "Recipient:" + recipient + "\n" +
                "Seen:" + (isSeen ?"Yes" : "No")+ "\n");
    }

    @Override public void printCommunicationMethod(){
        System.out.println("Protocol - SMS");
    }
}
