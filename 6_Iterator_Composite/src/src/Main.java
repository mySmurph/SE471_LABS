//  Main.java
package src;

import src.Blue.Attachment;
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
//        NotificationBar nb = new NotificationBar(nc);
//        nb.printNotifications();

        System.out.println("make attachment");
        Attachment felix = new MediaAttachment("FelixTheCat");
        nc.getItem(0).attach(felix);
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
