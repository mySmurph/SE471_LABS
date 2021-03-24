package src.Green;

import src.Blue.FileAttachment;
import src.Blue.Notification;

import java.util.ArrayList;

public class NotificationCollection implements NotificationCollectionIF{
    ArrayList<Notification> items;

    public NotificationCollection(){
        items = new ArrayList<>();
    }
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(this) ;
    }

    public Notification getItem(int index){
        return items.get(index);
    }

    public void addItem(String str){
        items.add(new Notification(str));
    }

    public int getLength(){ return items.size();}

}
