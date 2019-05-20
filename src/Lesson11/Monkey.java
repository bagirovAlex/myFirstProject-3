package Lesson11;

public class Monkey extends ZooAnimal {

    public Monkey() {
    }

    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("YAYAYYyyyyyaaa");
    }

    @Override
    public void jump() {
        System.out.println("Обязьяна прыгает!");
    }

    @Override
    public void printToCosole() {
        System.out.println("Обязьяна с ценой: " + this.getCost());
    }
}
