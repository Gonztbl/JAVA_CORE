package ABSTRACT;
import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected ArrayList<ConTact> contacts;

    public Phone() {
        contacts = new ArrayList<>();
    }

    public Phone(ArrayList<ConTact> contacts) {
        this.contacts = contacts;
    }

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name,String newphone);
    public abstract void searchContact(String name);

}
