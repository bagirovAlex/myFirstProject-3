package homework.lesson1;

public class Main3 {
    public static void main(String[] args) {
        // Задача: Вывести числа в диапазоне от 500 до 1000, которые делятся без остатка на 7 и на 19
        for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                System.out.println(i);
            }

        }

    }
}
