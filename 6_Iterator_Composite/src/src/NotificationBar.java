//  NotificationBar.java
package src;

import src.Blue.Notification;
import src.Green.NotificationCollectionIF;
import src.Green.NotificationIteratorIF;

public class NotificationBar {
    private NotificationCollectionIF notifications;

    /**
     * set the notification collection object
     * @param nc NotificationCollectionIF
     */
    NotificationBar(NotificationCollectionIF nc){ this.notifications = nc;}

    /**
     * prints notifications to console
     */
    public void printNotifications(){
        NotificationIteratorIF iterator = notifications.createIterator();
        while(iterator.hasNext()){
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }
    }
}
