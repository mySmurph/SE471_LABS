//  FileAttachment.java

package src.Blue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAttachment extends Attachment{

    /**
     * set the attached file
     * @param file
     */
    public FileAttachment(String file){
        this.fileName = file;
    }

    /**
     * reads the first few lines of the file to generate a preview of the file
     * @return string of a preview of the file
     */
    public String preview(){
        StringBuilder fileSnip = new StringBuilder();
        try{
            String buf;
            Scanner fileScan = new Scanner(new File("src/FileAttachments/"+fileName));
            int i = 0;
            int limit = 3;
            while(fileScan.hasNext() & i++ < limit){
                buf  = fileScan.nextLine();
                fileSnip.append(buf + " ");
            }
            fileSnip.append("...");
            fileScan.close();
        }catch (IOException e){
            fileSnip.append("<Error>");
        }

        return String.format("File Attachment: %s\n%s\n", fileName, fileSnip.toString());
    }
}
