package presenters;


import models.DateReservation;
import models.Reservation;
import models.Table;

import java.util.Collection;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;
    private Collection<Table>tables;
    public BookingPresenter(Model model,View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Загрузить список всех столиков
     */
    public void loadTables(){
        if (tables == null){
            tables = model.loadTables();
        }
    }

    /**
     * Отобразить список столиков
     */
    public void updateView() {
        view.showTables(tables);
    }

    /**
     * Отобразиь результат резерва
     * @param reservationId номер резерва
     */
    private void updateReservationStatusView(int reservationId){
        view.showReservationStatus(reservationId);
    }

    /**
     * Получили уведомление о попытке бронирования столика
     * @param orderDate дата брони
     * @param tableId номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(DateReservation orderDate, int tableId, String name) {
        int reservationId = model.reservationTables(orderDate,tableId,name);
        updateReservationStatusView(reservationId);
    }

    /**
     * Получили уведомление о попытке отменить бронь
     * @param reservationId номер брони
     */
    @Override
    public void canselReservationTable(int reservationId) {
        model.canselReservation(reservationId);
    }


}

