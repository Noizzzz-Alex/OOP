package presenters;

import models.DateReservation;
import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    /**
     * Получение всех столиков в ресторане
     * @return список столиков
     */
    Collection<Table> loadTables();

    /**
     * Броникрование столика
     * @param reservationDate Дата резерва
     * @param tableId номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTables(DateReservation reservationDate, int tableId, String name);

}
