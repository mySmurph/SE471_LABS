package src;

import src.Blue.Notification;
import src.Green.NotificationCollectionIF;
import src.Green.NotificationIteratorIF;

public class NotificationBar {
    private NotificationCollectionIF notifications;

    NotificationBar(NotificationCollectionIF nc){ this.notifications = nc;}

    public void printNotifications(){
        NotificationIteratorIF iterator = notifications.createIterator();
        while(iterator.hasNext()){
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }
    }
}
