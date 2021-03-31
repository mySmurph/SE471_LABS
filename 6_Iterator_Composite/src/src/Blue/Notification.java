//  Notification.java

package src.Blue;

public class Notification {

    /**
     * the attachment the notification is for
     */
    private Attachment attachment;

    /**
     * notification message
     */
    private String message;

    /**
     * constructor
     * @param mess
     */
    public Notification(String mess){   this.message = mess;}

    /**
     * attache attachment
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
        return message+"\n"+ ((attachment==null)? "<Attachment Not Available>" : attachment.preview());
    }
}
