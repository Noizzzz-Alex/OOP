import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Cat cat1 = new Cat("Barsuk");
        Cat cat2 = new Cat("Admiral");
        Cat cat3 = new Cat("Baloo");
        Cat cat4 = new Cat("Baron");
        Cat cat5 = new Cat("Benedict");
        Cat cat6 = new Cat("Blitz");
        Cat cat7 = new Cat("Boomer");
        Cat cat8 = new Cat("Caesar");
        Cat cat9 = new Cat("Carter");
        Cat cat10 = new Cat("Cooper");
        Plate plate = new Plate(30);
        List<Cat>cats = new ArrayList<>();
        cats.add(cat);cats.add(cat1);cats.add(cat2);cats.add(cat3);cats.add(cat4);cats.add(cat5);cats.add(cat6);
        cats.add(cat7);cats.add(cat8);cats.add(cat9);cats.add(cat10);
        mainMenu.Menu(cats,plate);



    }
}