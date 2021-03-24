package src.Blue;

public class MediaAttachment extends Attachment{
    Object mediaObject;
    MediaAttachment(String file, String ext, Object media){
        this.fileExtension = ext;
        this.fileName = file;
        this.mediaObject = media;
    }

    public void preview(){
        // play 5 frames from media object
    }
}
