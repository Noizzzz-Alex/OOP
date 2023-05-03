package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

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
        }
        return tables;
    }

    @Override
    public String toString() {
        return "TableModel{" +
                "tables=" + tables +
                '}';
    }
    public int reservationTable(Date reservationDate,int tableid,String name){
        for (Table table: tables) {
            if (table.getId() == tableid){
                Reservation reservation = new Reservation(reservationDate,name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Неверный номер столика");
    }
}
