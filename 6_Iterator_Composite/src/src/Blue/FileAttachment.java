package src.Blue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAttachment extends Attachment{
    FileAttachment(String file, String ext){
        this.fileExtension = ext;
        this.fileName = file;
    }
    public String preview(){
        //print out 1 line from file
        String buf;
        try{
            Scanner fileScan = new Scanner(new File(fileName+"."+fileExtension));
            buf  =  fileScan.hasNext()? fileScan.nextLine()+" ...": "<File Empty>";
            fileScan.close();
        }catch (IOException e){
            buf = "<Error>";
        }

        return String.format("File Attachment: %s\n%s\n", fileName, buf);

    }
}
