package src.Blue;

import java.io.IOException;

public abstract class Attachment {
    String fileName;

    public String preview() {
        return String.format("Generic Attachment: %s\n", fileName);
    }
}
