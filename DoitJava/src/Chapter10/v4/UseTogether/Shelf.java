package Chapter10.v4.UseTogether;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        System.out.println("here i am");
        shelf = new ArrayList<String>();
        System.out.println("Shelf##" + shelf);
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}

