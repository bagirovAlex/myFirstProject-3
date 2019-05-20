package Lesson11;

public class Main {
    public static void main(String[] args) {
        //создадим объект новый зоопрак которому мы будем покупать животоное в бюджете не более 100 000
        ZooPark zooPark = new ZooPark(100000);

        //Создаем животоного
        Tiger tiger = new Tiger(20000);

        Popugay popugay1 = new Popugay(40000);
        Popugay popugay2 = new Popugay(10000);

        Monkey monkey1 = new Monkey(20000);
        Monkey monkey2 = new Monkey(12000);

        zooPark.buyAnimal(tiger);
        zooPark.buyAnimal(popugay1);
        zooPark.buyAnimal(popugay2);
        zooPark.buyAnimal(monkey1);
        zooPark.buyAnimal(monkey2);

        zooPark.printToConsole();
        zooPark.voiceeee();
        zooPark.mostExpensiveAnimal();
        zooPark.summAnimals();

    }
}
