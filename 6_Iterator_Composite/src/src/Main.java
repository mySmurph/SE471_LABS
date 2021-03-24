package src;

import src.Green.NotificationCollection;

public class Main {

    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        nc.addItem("FelixTheCat");
        nc.addItem("TrueColors.txt");
        nc.addItem("Dilbert");
        nc.addItem("ToxicThoughts.txt");
        nc.addItem("WhoDoYouLove.txt");
        nc.addItem("SpongeBob");

        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();

    }
}
