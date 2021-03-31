//  Main.java
package src;

import src.Blue.Attachment;
import src.Blue.FileAttachment;
import src.Blue.MediaAttachment;
import src.Green.NotificationCollection;

public class Main {

    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        nc.addItem("FelixTheCat meme");
        nc.addItem("True Colors Lyrics");
        nc.addItem("Dilbert comic");
        nc.addItem("Toxic Thoughts lyrics");
        nc.addItem("Who Do You Love lyrics");
        nc.addItem("SpongeBob meme");
        nc.addItem("You really gotta see this meme Felix The Cat");
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();

        System.out.println("-----Make Attachments-----");
        Attachment felix = new MediaAttachment("FelixTheCat");
        Attachment bob = new MediaAttachment("SpongeBob");
        Attachment cindy = new FileAttachment("TrueColors.txt");

        nc.getItem(0).attach(felix);
        nc.getItem(6).attach(felix);
        nc.getItem(1).attach(cindy);
        nc.getItem(5).attach(bob);

        nb.printNotifications();
    }
}
