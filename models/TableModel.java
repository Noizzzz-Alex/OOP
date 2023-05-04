package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;

public class TableModel implements Model {

    private Collection<Table> tables;


    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int reservationTables(DateReservation reservationDate, int tableId, String name) {
        for (Table table : tables) {
            if (table.getId() == tableId) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Неверный номер столика");
    }

    /**
     * Изменение резерва
     *
     * @param idReservationOld номер резева
     * @param reservationNew   добавление нового резерва
     */
    public void editReservation(int idReservationOld, Reservation reservationNew,int tableId) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == idReservationOld) {
                    table.getReservations().remove(reservation);
                }throw new RuntimeException("Неверный номер резерва");
            }
            if (table.getId() == tableId) {
                table.getReservations().add(reservationNew);
            }
        }

    }

    /**
     * Удаление резервирования
     *
     * @param idReservationOld номер резерва
     */
    public void canselReservation(int idReservationOld) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == idReservationOld) {
                    table.getReservations().remove(reservation);
                    System.out.printf("Ваш резерв #%d удален.",reservation.getId());
                    return;
                }
            }
        }
        throw new RuntimeException("Неверный номер резерва");
    }


}
