//  Notification.java

package src.Blue;

public class Notification {

    /**
     * the attachment the notification is for
     */
    private Attachment attachment;
    private String message;

    public Notification(String mess){   this.message = mess;}

    /**
     * constructor
     * @param att the attachment
     */
    public void attach(Attachment att){
            attachment = att;
    }

    /**
     * get a preview of the content of the attachment
     * @return String
     */
    public String getContent(){
        return message+"\n"+attachment.preview();
    }
}
