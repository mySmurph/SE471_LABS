package src.Blue;

public class Notification {
    private Attachment attachment;
    public String getContent(){
        return attachment.preview();
    }
}
