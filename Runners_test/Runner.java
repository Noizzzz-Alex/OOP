package Runners_test;

public interface Runner {
    String getName();

    /**
     * Прыжок
     * @param height высота прыжка
     * @return результат прыжка(удалось ли перепрыгнуть)
     */
    default boolean jump(int height){
        if (height <= getMaxJump()) {
            System.out.printf("%s top obstacle: %d\n", getName(),height);
            return true;
        }
        System.out.printf("%s dropped out\n", getName());
        return false;
    }

    /**
     * Бег
     * @param length дистанция
     * @return результат забега(удалоь ли пробежать)
     */
    default boolean run(int length){
        if (length <= getMaxRun()){
            System.out.printf("%s ran distance: %d\n", getName(),length);
            return true;}
        System.out.printf("%s dropped out\n", getName());
        return false;
    }
    int getMaxRun();
    int getMaxJump();
}
