package views;

import models.DateReservation;
import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Усановить наблюдателя
     * @param observer наблюдатель(презентер)
     */
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;

    }

    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table>tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }


    /**
     * Действие клиента(пользователь нажал на кнопку брони),
     * броникрование столика
     * @param orderDate дата бронирования
     * @param tableId номер столика
     * @param name имя клиента
     */
    public void reservationTable(DateReservation orderDate, int tableId, String name){
        observer.onReservationTable(orderDate,tableId,name);
    }

    /**
     * отобразить результат бронирования
     * @param reservationid номер брони
     */
    @Override
    public void showReservationStatus(int reservationid) {
        if(reservationid > 0){
            System.out.printf("Ваш столик успешно забронирован. Номер брони: #%d\n",reservationid);
        }
        else {
            System.out.println("Ошибка бронирования");
        }
    }
}
