abstract class Animal {
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    public void jump(){
        System.out.println("Animal jump");
    }
    public abstract void voice();//не имеет конкретной реализации


}
