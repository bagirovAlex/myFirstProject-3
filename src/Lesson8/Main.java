package Lesson8;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {40, 78, 6, 55, 15, 34, 789, 856, 999, 345};
        int sumBy5 = Metods.summaChiselBy5(numbers);
        System.out.println(sumBy5);

//        int[] massive = Metods.massiveWithNums(numbers,'5');
//        for(int i =0; i<massive.length;i++){
//            System.out.println(massive[i]);
//        }
        String text1 = "Hellow world!";
        String text2 = "He didn't words!";
        String result = Metods.getEqChars(text1, text2);
        System.out.println(result);
    }
}
