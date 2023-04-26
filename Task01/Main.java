package Task01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleAccount account = new SimpleAccount(1, 1000);
        CustomAccountIdentifier currency = new CustomAccountIdentifier(555, "Queen");

        UniversalAccount uni = new UniversalAccount("AAA111", 500000);
        UniversalAccount uni2 = new UniversalAccount(50000, 500000);
        UniversalAccount uniSuper = new UniversalAccount(new CustomAccountIdentifier(147855, "Queen_Gambit")
                , 10000000);

        System.out.println(uniSuper.getId());
        Account<Integer> acc1 = new Account<>(40, 50000);
        System.out.println(acc1);
        int idTemp = acc1.getId();
        Integer[] nums = {1,2,3,4,5,6,7,8};
        String[] strings = {"a","b","c","e"};
        Object[] nums1 = ArrayUtils.replaceTwoElements(nums,1,2);
        String[] boors = ArrayUtils.replaceElements(strings,1,2);
        System.out.println(Arrays.toString(boors));

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
 * Пример:
 * Account<Integer> acc1 = new Account<>(40,50000);
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

class ArrayUtils {
    public static Object[] replaceTwoElements(Object[] array, int index1, int index2) {
        Object[] newArray = array.clone();
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0)
            return null;
        Object obj = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = obj;
        return newArray;
    }



    /** Создание обобщенного метода
     *
     * @param array принимает на вход массив любого типа
     * @param index1 индекс  для замены №1
     * @param index2 индекс  для замены №2
     * @return возвращает null если условие не выполняется и новый массив при выполнении.
     * @param <T> T[] вместо Object позволяет работать с типами без даункастинга
     */

    public static <T> T[] replaceElements(T[] array, int index1, int index2) {
        T[] newArray = array.clone();
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0)
            return null;
        T obj = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = obj;
        return newArray;
    }
}