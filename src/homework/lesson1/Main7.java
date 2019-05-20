package Lesson3;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника:");
        int storanaA = scanner.nextInt();

        System.out.println("Введите вторую сторону треугольника:");
        int storanaB = scanner.nextInt();

        System.out.println("Введите третью сторону треугольника:");
        int storanaC = scanner.nextInt();

        System.out.println("Сторона А =" + storanaA + ", " + "Сторона В =" + storanaB + ", " + "Сторона С =" + storanaC);

        System.out.println("Площадь или периметр?");
        String action = scanner.next();

        if (action.equals("периметр")) {
            System.out.println("Периметр треугольника = " + (storanaA + storanaB + storanaC));

        } else {
            double p = (double)(storanaA + storanaB + storanaC)/2; //Расчет полуперимтера, как сумма сторон деленая на 2
            System.out.println(Math.sqrt(p*(p-storanaA)*(p-storanaB)*(p-storanaC))); //Расчет по формуле Герона
        }
    }
}