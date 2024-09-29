package Week2.main.java.com.mycompany.app;

import java.util.ArrayList;

public class NNCollection {
    private ArrayList<NameNumber> collection;

    public NNCollection() {
        collection = new ArrayList<>();
    }

    public void add(NameNumber nn) {
        collection.add(nn);
    }

    public void printAll() {
        for (NameNumber nn : collection) {
            System.out.println(nn);
        }
    }
}
