package homework.lesson1;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        //Calculation the area of a circle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите радиус в см:");
        double radiusCircle = scanner.nextInt(); //Как проверить что введены цифры, а не символы?

        System.out.println("Посчитать Площадь - нажмите 1");
        System.out.println("Посчитать Длину окружности - нажмите 2");
        int inputUsers = scanner.nextInt();

        if(inputUsers == 1){
            System.out.println("Площадь круга = " + (int)(Math.PI * Math.pow(radiusCircle, 2)) + " см.");
        }else if(inputUsers == 2){
            System.out.println("Длина окружности круга = " + (int)(2*(Math.PI)*radiusCircle) + "см.");
        }else{
            System.out.println("Выбран неверный вариант!");
        }
    }
}
