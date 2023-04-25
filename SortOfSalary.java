import java.util.Comparator;

public class SortOfSalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculateSalary(),o2.calculateSalary());
    }
    @Override
    public Comparator<Employee> reversed() {
        return Comparator.super.reversed();
    }
}
