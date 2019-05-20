package homework.lesson1;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        //Calculation the area of a trapeze
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое основание трапеции в см:");
        double basis1 = scanner.nextDouble();

        System.out.println("Введите второе основание трапеции в см:");
        double basis2 = scanner.nextDouble();

        System.out.println("Введите высоту трапеции в см:");
        double altitude = scanner.nextDouble();

        System.out.println("Введите боковую сторону трапеции в см:");
        double oneSide = scanner.nextDouble();

        if (altitude > oneSide) {

            System.out.println("Высота трапеции долна быть меньше боковой стороны!");

        }
        System.out.println("посчитать Площадь - нажмите 1. Посчитать периметр - нажмите 2.");
        String user1Or2 = scanner.next();

        if (user1Or2.equals("1")) {
            System.out.println("Площадь трапеции равна: " + (altitude * ((basis1 + basis2) / 2)));
        } else if (user1Or2.equals("2")) {
            System.out.println("Периметр трапеции равен: " + (basis1 + basis2 + oneSide * 2));
        } else {
            System.out.println("Вы выбрали неверный вариант!");

        }
    }
}
