package src.Blue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAttachment extends Attachment{
    FileAttachment(String file, String ext){
        this.fileExtension = ext;
        this.fileName = file;
    }
    public void preview()throws IOException {
        //print out 1 line from file
        Scanner fileScan = new Scanner(new File(fileName+"."+fileExtension));
        String buf  =  fileScan.hasNext()? fileScan.nextLine(): "<error reading file>";
        System.out.printf("Attachment: %s\n %s...", fileName, buf);
        fileScan.close();
    }
}
