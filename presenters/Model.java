package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();

    /**
     * Броникрование столика
     * @param reservationDate Дата резерва
     * @param tableid номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTables(Date reservationDate,int tableid,String name);

}
