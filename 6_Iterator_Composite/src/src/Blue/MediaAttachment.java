package src.Blue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MediaAttachment extends Attachment{
    MediaAttachment(String file){
        this.fileName = file;
    }

    public String preview(){
        StringBuilder asciiArt = new StringBuilder();
        try{
            String buf;
            Scanner fileScan = new Scanner(new File("src/MediaAttachments/"+fileName));
            while(fileScan.hasNext()){
                buf  = fileScan.nextLine();
                asciiArt.append(buf + "\n");
            }
            fileScan.close();
        }catch (IOException e){
            asciiArt.append("<Error>");
        }

        return String.format("Media Attachment: %s\n%s", fileName, asciiArt.toString());
    }
}
