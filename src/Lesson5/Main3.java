package Lesson5;

public class Main3 {
    public static void main(String[] args) {
        //напечатать два самых больших числа
        int[] numbers = {1, 8, 5, 2, 7, 4, 6};
        int bigestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > bigestNumber) {
                bigestNumber = numbers[i];
            }
        }
        System.out.println(bigestNumber);
        int bigNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > bigNumber && numbers[i] < bigestNumber) {
                bigNumber = numbers[i];
            }
        }
        System.out.println(bigNumber);
    }
}
