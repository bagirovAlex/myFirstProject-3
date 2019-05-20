package Lesson11;

import Lesson10.Animal;

public class ZooPark {
    //поля класса
    private int money;
    private ZooAnimal[] kletkiForAnimals = new ZooAnimal[10];

    //конструкторы
    public ZooPark() {
    }

    public ZooPark(int money) {
        this.money = money;
    }

    //Методы
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //Добавлям метод "купить животное"
    public void buyAnimal(ZooAnimal animal) {

        //Проверяем достаточность средств при покупке
        if (money < animal.getCost()) {
            System.out.println("Недостаточно денег для покупки этого животного");
            return;        // если денег не хватает то остановить метод
        }
        //Далее нужно найти первую свободную клетку в массиве
        for (int i = 0; i < kletkiForAnimals.length; i++) {
            if (kletkiForAnimals[i] == null) {
                kletkiForAnimals[i] = animal;
                //выполняем процедуру уменьшение денег при покупки
                money = money - animal.getCost();
                return; // что бы не заполнить этим живтоным все пустые ячейки
            }
        }
        System.out.println("Нет свободных клеток!");
    }

    //Добавляем метод распечатки животных которые у нас есть
    public void printToConsole() {
        for (int i = 0; i < kletkiForAnimals.length; i++) {
            if (kletkiForAnimals[i] != null) {
                kletkiForAnimals[i].printToCosole();
            }
        }
    }

    //дОбавляем метод чтобы животные подали голос
    public void voiceeee() {
        for (int i = 0; i < kletkiForAnimals.length; i++) {
            if (kletkiForAnimals[i] != null) {
                kletkiForAnimals[i].voice();
            }
        }
    }

    //Смаое дорогое животное
    public void mostExpensiveAnimal() {
        ZooAnimal maxCostAnimal = kletkiForAnimals[0];

        for (int i = 0; i < kletkiForAnimals.length; i++)
            if (kletkiForAnimals[i] != null) {
                if (maxCostAnimal.getCost() < kletkiForAnimals[i].getCost()) {
                    maxCostAnimal = kletkiForAnimals[i];
                }
            }
        System.out.print("Самое дорогое животное: ");
        maxCostAnimal.printToCosole();
    }

    //Общая стоимость живтониых в хоопраке
    public void summAnimals(){
       int summAll = 0;
        for (int i=0; i<kletkiForAnimals.length;i++){
            if(kletkiForAnimals[i]!=null){
               summAll +=kletkiForAnimals[i].getCost();
            }
        }
        System.out.println("Общая стоимость живтоных: "+ summAll);
    }
}
