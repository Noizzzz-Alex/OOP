package presenters;

import models.DateReservation;

import java.util.Date;

public interface ViewObserver {



    void onReservationTable(DateReservation orderDate, int table, String name);

}
