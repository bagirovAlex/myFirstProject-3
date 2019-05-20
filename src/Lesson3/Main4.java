package Lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 9, 6, 20};
        int sum = 0;
        for(int i =0; i<numbers.length;i++){

            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }

}
