package Task01;

public class Main {
    public static void main(String[] args) {
        SimpleAccount account = new SimpleAccount(1, 1000);
        CustomAccountIdentifier currency = new CustomAccountIdentifier(555, "Queen");

        UniversalAccount uni = new UniversalAccount("AAA111", 500000);
        UniversalAccount uni2 = new UniversalAccount(50000, 500000);
        UniversalAccount uniSuper = new UniversalAccount(new CustomAccountIdentifier(147855, "Queen_Gambit")
                , 10000000);

        System.out.println(uniSuper.getId());
        Account<Integer> acc1 = new Account<>(40,50000);
        System.out.println(acc1);
        int idTemp = acc1.getId();
    }
}

class UniversalAccount {
    private final Object id;
    private double amount;

    @Override
    public String toString() {
        return "UniversalAccount{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }

    public Object getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public UniversalAccount(Object id, double amount) {
        this.id = id;
        this.amount = amount;
    }
}

class SimpleAccount {
    /**
     * final - модификатор запрещающий редактирование
     * данной переменной в контексте кодового блока
     * данного класса.(константа).
     * Проинициализировать возможно только в контрукторе(только один раз).
     */
    private final int id;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public SimpleAccount(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return String.format("id счета: %s |Доступные средства : %.2f руб.", id, amount);
    }
}

class CustomAccountIdentifier {
    private int id;
    private String prefix;

    public CustomAccountIdentifier(int id, String prefix) {
        this.id = id;
        this.prefix = prefix;
    }

    public int getId() {
        return id;
    }

    public String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return "CustomAccountIdentifier{" +
                "id=" + id +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}

/**
 * Класс с универсальным параметром.
 * Универсальный параметр превращает обычный класс в обобщенный.
 * Параметров может быть сколько угодно.
 * Перечисляются через запятую <T,T1...T10>.
 * При создании экземпляра класса нужно будет описать на каждый параметр конкретный тип.
 * Тип может быть только ссылочным.
 *
 * @param <T>
 */
class Account<T> {
    private final T id;
    private double amount;

    public T getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }

    public Account(T id, double amount) {
        this.id = id;
        this.amount = amount;
    }
}