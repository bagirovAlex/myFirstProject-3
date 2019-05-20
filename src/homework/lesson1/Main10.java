package homework.lesson1;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        //ellipse
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите больший диаметр элипса в см:");
        double bigD = scanner.nextDouble();

        System.out.println("Введите меньший диаметр элипса в см:");
        double smallD = scanner.nextDouble();


        System.out.println("Расчитать Площадь элипса - нажмите 1:");
        System.out.println("Расчитать Длину окружности - нажмите 2:");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Площадь элипса равна: " + (int)(Math.PI*bigD*smallD) + " см.");
        }else if(input == 2) {
            System.out.println("Длина окружности элипса равна: " + (int)(Math.PI*((bigD+smallD)/2))+ " см.");
        }else {
            System.out.println("Неверный вариант!");
        }
    }
}
