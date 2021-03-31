//  NotificationCollection.java

package src.Green;

import src.Blue.Notification;
import java.util.ArrayList;

public class NotificationCollection implements NotificationCollectionIF{

    /**
     * the data structure used for the collection
     */
    ArrayList<Notification> items;

    /**
     * constructor
     */
    public NotificationCollection(){  items = new ArrayList<>(); }

    /**
     * get an iterator for this collection
     * @return NotificationIteratorIF
     */
    public NotificationIteratorIF createIterator() {   return new NotificationIterator(this) ;   }

    /**
     * get the notification at index
     * @param index
     * @return Notification
     */
    public Notification getItem(int index){    return items.get(index);    }

    /**
     * add item to collection
     * @param str
     */
    public void addItem(String str){    items.add(new Notification(str));    }


    /**
     * get how many notifications are in the collection
     * @return int
     */
    public int getLength(){ return items.size();}
}
