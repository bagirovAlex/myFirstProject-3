package Home2;

public class Metods {
    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20 (включительно),
    //если да - вернуть true, в противном случае - false.
    public static boolean checkSummTwoNumFrom10To20(int num1, int num2) {

        //Считаем сумму полученных чисел
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //2) Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль положительное ли число передали, или отрицательное.
    //Замечание: ноль считаем положительным числом.
    public static void whatNumPlusOrMinus(int num) {
        if (num < 0) {
            System.out.println(num + " Это отрицательное число.");
        }else {
            System.out.println(num + " Это положительное число.");
        }
    }


}
