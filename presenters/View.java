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
     * @param reservationId номер брони
     */
    void showReservationStatus(int reservationId);
}
