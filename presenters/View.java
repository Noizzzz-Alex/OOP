package presenters;

import models.Table;

import java.util.Collection;

public interface View {
    /**
     * Отобразить список всех столиков
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * УСтановить нового наблюдателя
     * @param observer наблюдатель(презентер)
     */
    void setObserver(ViewObserver observer);

    /**
     * Отобразитьрузельтат брони столика
     * @param reservationid номер брони
     */
    void showReservStatus(int reservationid);
}
