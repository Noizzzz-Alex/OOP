import java.util.Comparator;

public class SortOfOld implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getOld() - o2.getOld();
    }

    @Override
    public Comparator<Employee> reversed() {
        return Comparator.super.reversed();
    }
}
