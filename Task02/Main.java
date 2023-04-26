package Task02;

public class Main {
    public static void main(String[] args) {
        DebetAccount<Entity> entityDebetAccount1 =
                new DebetAccount<>(new Entity("E435364-B12",
                        "Bool and Grill"), 42_000_000);
        CreditAccount<Person> personCreditAccount =
                new CreditAccount<>(new Person("P937160-16",
                        "John", "Smith"), 400);
        Transaction<Account<?>> transaction1 = new Transaction<>(entityDebetAccount1,
                personCreditAccount,20000);
        transaction1.execute();


    }
}

/**
 * Обобщенный класс
 * ? является подстановочным знаком и используется в качестве ссылки на
 * неизвестный тип.
 *
 * @param <T>
 */
class Transaction<T extends Account<? extends PersonalData>> {

    private final T from;   //откуда
    private final T to;     //куда
    private double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() > amount) {
            System.out.printf("Операция перевода на сумму %.2f руб\n" +
                            "Счет списания   : #%s: %.2f руб.\n" +
                            "Счет зачисления : #%s: %.2f руб.", amount, from.getData(), from.getAmount(),
                    to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println("Текущее состояние счетов: ");
            System.out.println(from);
            System.out.println(to);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public T getFrom() {
        return from;
    }

    public T getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}


class DebetAccount<T extends PersonalData> extends Account<T> {

    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}

class CreditAccount<T extends PersonalData> extends Account<T> {

    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}

abstract class Account<T extends PersonalData> {
    private final T data;
    private double amount;

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Счет: %s | Доступных стредств: %.2f",data,amount);
    }
}

interface PersonalData {
    String getINN();


}

/**
 * Физическое лицо
 */
class Person implements PersonalData {
    private final String inn;
    private final String firstName;
    private String lastName;


    public Person(String inn, String firstName, String lastName) {
        this.inn = inn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%-10s| %-10s %-10s|", inn, lastName, firstName);
    }

    @Override
    public String getINN() {
        return null;
    }
}

/**
 * Юридическое лицо
 */
class Entity implements PersonalData {
    private final String inn;
    private String name;

    public Entity(String inn, String name) {
        this.inn = inn;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getINN() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("%-10s |%-15s", inn, name);
    }
}

