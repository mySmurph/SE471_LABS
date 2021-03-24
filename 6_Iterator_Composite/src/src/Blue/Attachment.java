package src.Blue;

import java.io.IOException;

public abstract class Attachment {
    String fileName;
    String fileExtension;

    public String preview() {
        return String.format("Generic Attachment: %s.%s\n", fileName, fileExtension);
    }
}
