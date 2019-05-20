package Lesson5;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = {54,67,5,89,3,42,56,78,89,5,11};
        for(int i =0; i<numbers.length;i++){
            for(int j=2; j<numbers[i]-1;j++){
                if(numbers[i]%j == 0){
                    break;
                }else {
                    System.out.println(numbers[i]);
                }
            }

        }
    }
}
