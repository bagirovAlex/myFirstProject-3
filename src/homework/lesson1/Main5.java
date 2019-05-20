package homework.lesson1;

public class Main5 {
    public static void main(String[] args) {
        //Задача: напечатать на консоль числа от 10 до 30, при этом не печатать числа: 21,22,23,24
        for (int i = 10; i <= 30; i++){
            if (i!=21 && i!=22 && i!=23 && i!=24){ //Здесь хотелось бы диапазон указать 21-24 но не знаю пока как((
                System.out.println(i);
            }
        }
    }
}
