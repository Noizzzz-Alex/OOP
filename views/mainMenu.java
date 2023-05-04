package views;

import models.DateReservation;
import models.Reservation;
import models.TableModel;
import presenters.BookingPresenter;

import java.util.Random;
import java.util.Scanner;

public class mainMenu {
    public static void Menu() {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel,bookingView);
        bookingPresenter.loadTables();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Ресторан "У окна":
                    ___________________________________
                    1 - Забронировать столик
                    2 - Изменить бронь
                    3 - Удалить бронь
                    4 - Список брони по датам
                    5 - Список брони на сегодня
                    6 - Вывести список столиков
                    ___________________________________
                    0 - Выход""");
            System.out.print("Выберите пункт меню: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                DateReservation dateReservation = DateReservation.getDate();
                System.out.print("Введите номер желаемого столика: ");
                int tempTableID = Integer.parseInt(sc.nextLine());
                System.out.print("На чье имя резервировать?: ");
                str = sc.nextLine();
                System.out.printf("%s, ",str);
                bookingView.reservationTable(dateReservation,tempTableID,str);

            }
            if (str.equals("2")) {
                System.out.print("Введите номер резерва: ");
                int tempIdReservation = Integer.parseInt(sc.nextLine());
                DateReservation dateReservation = DateReservation.getDate();
                System.out.print("Введите номер желаемого столика: ");
                int tempTableID = Integer.parseInt(sc.nextLine());
                System.out.print("На чье имя резервировать?: ");
                String tempName = sc.nextLine();
                System.out.printf("%s, ",tempName);
                bookingView.canselReservation(tempIdReservation);
                bookingView.reservationTable(dateReservation,tempTableID,tempName);
            }
            if (str.equals("3")) {
                System.out.print("Введите номер резерва: ");
                int tempIdReservation = Integer.parseInt(sc.nextLine());
                bookingView.canselReservation(tempIdReservation);
            }
            if (str.equals("4")) {
                return;
            }
            if (str.equals("5")) {
                return;
            }
            if (str.equals("6")) {
                bookingPresenter.updateView();
            }
        }
    }


}
