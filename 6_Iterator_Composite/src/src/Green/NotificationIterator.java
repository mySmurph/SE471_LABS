package src.Green;

import src.Blue.Notification;

public class NotificationIterator implements NotificationIteratorIF{

    private NotificationCollection collection;
    private int index;

    NotificationIterator(NotificationCollection c){
        this.index = 0;
        this.collection = c;
    }
    public boolean hasNext() {
        return index < collection.getLength();
    }

    public Notification next() {
        return collection.getItem(index++);
    }
}
