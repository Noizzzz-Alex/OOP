public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Baron", "Black");
        Dog dog = new Dog("Dart", 10);
        Bird bird = new Bird("Bool");

//        System.out.printf("color cat: %s\n", cat.getColor());
//        System.out.printf("cat name: %s\n", cat.getName());

        Animal cat2 = new Cat("Bubble", "White");
//        cat.voice(); пример динамической диспетчирезации метода

//        System.out.printf("color cat: %s\n", ((Cat) cat2).getColor());// Downcasting типа Анимал к Кат
//        System.out.printf("cat name: %s\n", cat2.getName());

        Object[] zoo = new Object[]{
                cat, dog, cat2, bird
        };
        for (Object animal : zoo) {
            if (animal instanceof Flyable){
                ((Flyable)animal).fly(50);
            }
        }
    }


}