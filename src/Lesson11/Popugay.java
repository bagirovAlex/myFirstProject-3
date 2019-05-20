package Lesson11;

public class Popugay extends ZooAnimal {

    public Popugay() {
    }

    public Popugay(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("IIIIAaaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Попугай прыгает!");
    }

    @Override
    public void printToCosole() {
        System.out.println("Попугай с ценой: " + this.getCost());

    }
}
