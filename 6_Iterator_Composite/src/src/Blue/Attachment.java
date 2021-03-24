package src.Blue;

import java.io.IOException;

public abstract class Attachment {
    String fileName;
    String fileExtension;

    public void preview() throws IOException {
        System.out.printf("Attachment: %s.%s\n", fileName, fileExtension);
    }
}
