import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

public class Main {


    public static void main(String[] args) {
        //mainMenu.Menu();
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel,bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();
    }
}





