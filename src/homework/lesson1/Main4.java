package homework.lesson1;

public class Main4 {
    public static void main(String[] args) {
        // Задача: вывести на консоль сумму чисел в диапазоне от 50 до 1000, которые делятся без остатка на 7 и на 19
        int a = 0; // обявляю переменную в которую буду складывать результаты цикла
        for (int i = 50; i <= 1000; i++) { // инифиализирую переменную i для цикла
            if (i % 7 == 0 && i % 19 == 0) { // В запущенном цикле накладываю условие
                a = a + i;    //Складываю значения из цикла перезаписываемой i на переменную накопительную a, должно быть 3724

            }
        }
        System.out.println(a); // вывожу сумму чисел выбранных циклом 133+266+399+532+665+798+931
    }
}
