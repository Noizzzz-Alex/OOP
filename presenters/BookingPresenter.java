package presenters;


import models.Table;

import java.util.Collection;
import java.util.Date;

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
        this.view.showTables(tables);
    }
    private void updateReservationStatusView(int reservationId){

    }

    /**
     * Получили уведомление о попытке бронирования столика
     * @param orderDate дата брони
     * @param tableid номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableid, String name) {
        int reservationid = model.reservationTables(orderDate,tableid,name);
        if (reservationid > 0) {

        }
    }
}
