package homework.lesson1;

public class MathUtils {

    //Площадь треугольника
    public static double areaTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    //Четные числа из массива
    public static void evenMassive(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int currentNumbers = numbers[i];
            if (currentNumbers % 2 == 0) {
                System.out.println("Четное число:" + currentNumbers);
            }
        }
    }

    //Сложение дробей
    public static void summFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
        int summaNumerator = (numerator1 * denominator2) + (numerator2 * denominator1);
        int summaDenominator = denominator1 * denominator2;
        //Проверка сокращения на 2
        if (summaNumerator % 2 == 0 && summaDenominator % 2 == 0) {
            int summaNumerator2 = summaNumerator / 2;
            int summaDenominator2 = summaDenominator / 2;
            if (summaNumerator2 % summaDenominator2 == 0) {
                int integer = summaNumerator2 / summaDenominator2;
                System.out.println("Целое число:" + integer);
            } else {
                System.out.println("Сумма дробей:" + summaNumerator2 + "/" + summaDenominator2);
            }
        //Проверка сокращения на 3
        } else if (summaNumerator % 3 == 0 && summaDenominator % 3 == 0) {
            int summaNumerator2 = summaNumerator / 3;
            int summaDenominator2 = summaDenominator / 3;
            if (summaNumerator2 % summaDenominator2 == 0) {
                int integer = summaNumerator2 / summaDenominator2;
                System.out.println("Целое число:" + integer);
            } else {
                System.out.println("Сумма дробей:" + summaNumerator2 + "/" + summaDenominator2);
            }

        } else {
            int summaNumerator2 = summaNumerator / 1;
            int summaDenominator2 = summaDenominator / 1;
            System.out.println("Сумма дробей:" + summaNumerator2 + "/" + summaDenominator2);
        }


    }


}
