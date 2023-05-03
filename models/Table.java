package models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private final Collection<Reservation> reservations = new ArrayList<>();
    private static int counter;
    private final int id;
    {
        id = ++counter;
    }


    public int getId() {
        return id;
    }


}
