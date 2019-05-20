package Lesson11;

public class Tiger extends ZooAnimal {

    public Tiger() {
        // внутри каждого конструктура есть super(); вызов родительского конструтора без параметров
        // а можно вызвать super.
    }

    public Tiger(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("Rrrrrrrr");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает!");
    }

    @Override
    public void printToCosole() {
        System.out.println("Тигр с ценой: " + this.getCost());

    }
}
