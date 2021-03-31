//  NotificationIterator.java

package src.Green;

import src.Blue.Notification;

public class NotificationIterator implements NotificationIteratorIF{

    /**
     * the collection of objects the iterator works through
     */
    private NotificationCollection collection;

    /**
     * the current location of the pointer
     */
    private int index;

    /**
     * constructor
     * @param c the collection object
     */
    NotificationIterator(NotificationCollection c){
        this.index = 0;
        this.collection = c;
    }

    /**
     * determin if the iterator has more objects that it has not iterated through
     * @return Boolean - true if more objects, false if at end
     */
    public boolean hasNext() {    return index < collection.getLength();    }

    /**
     * get the next notification in the collection
     * @return Notification
     */
    public Notification next() {    return collection.getItem(index++);    }
}
