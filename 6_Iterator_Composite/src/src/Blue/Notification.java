//  Notification.java

package src.Blue;

public class Notification {

    /**
     * the attachment the notification is for
     */
    private Attachment attachment;

    /**
     * constructor
     * @param att the attachment
     */
    public Notification(String att){
            attachment = att.contains(".txt")? new FileAttachment(att): new MediaAttachment(att);
    }

    /**
     * get a preview of the content of the attachment
     * @return
     */
    public String getContent(){
        return attachment.preview();
    }
}
