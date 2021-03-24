package src.Blue;

public class MediaAttachment extends Attachment{
    Object mediaObject;
    MediaAttachment(String file, String ext, Object media){
        this.fileExtension = ext;
        this.fileName = file;
        this.mediaObject = media;
    }

    public String preview(){
        return String.format("Media Attachment: %s\n", fileName);
    }
}
