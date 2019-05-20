package Lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] avtoNumbers = new int[6];
        int chagThree = 3;
        for(int i = 0; i < avtoNumbers.length;i++) {
            avtoNumbers[i] = chagThree;
            chagThree = chagThree - 3;
        }
        for(int i = 0; i < avtoNumbers.length;i++){
            System.out.println(avtoNumbers[i]);

        }
    }
}
