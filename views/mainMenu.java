package views;

import models.DateReservation;
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
                    2 - Изменить/удалить бронь
                    3 - Список брони по датам
                    4 - Список брони на сегодня
                    
                    ___________________________________
                    0 - Выход""");
            System.out.print("Выберите пункт меню: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                System.out.print("Введите желаемую дату резерва(в формате ХХ-ХХ-ХХХХ(число-месяц-год)): ");
                String tempDate = sc.nextLine();
                System.out.print("Введите жедаемое время резерва (в формате ХХ-ХХ(часы-минуты)): ");
                String tempTime = sc.nextLine();
                System.out.print("Введите номер желаемого столика: ");
                int tempTableID = Integer.parseInt(sc.nextLine());
                System.out.print("На чье имя резервировать?: ");
                str = sc.nextLine();
                DateReservation dateReservation = DateReservation.getDate(tempDate,tempTime);
                System.out.printf("%s, ",str);
                bookingView.reservationTable(dateReservation,tempTableID,str);

            }
            if (str.equals("2")) {
                return;
            }
            if (str.equals("3")) {
                return;
            }
            if (str.equals("4")) {
                bookingPresenter.updateView();
            }
            if (str.equals("5")) {
                return;
            }
        }
    }
}
