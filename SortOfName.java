import java.util.Comparator;

public class SortOfName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Employee> reversed() {
        return Comparator.super.reversed();
    }
}


