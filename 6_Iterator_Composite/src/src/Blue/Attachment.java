//  Attachment.java
package src.Blue;

public abstract class Attachment {

    /**
     * the name of the file that is an attachment
     */
    String fileName;

    /**
     * abstract preview of file attachment
     * @return String
     */
    public String preview() {    return String.format("Generic Attachment: %s\n", fileName);    }
}
