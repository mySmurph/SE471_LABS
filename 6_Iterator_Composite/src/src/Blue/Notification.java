package src.Blue;

public class Notification {
    private Attachment attachment;
    public Notification(String msg){
            attachment = msg.contains(".txt")? new FileAttachment(msg): new MediaAttachment(msg);
    }
    public String getContent(){
        return attachment.preview();
    }
}
