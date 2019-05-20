package Lesson5;

//Перевернуть массив
public class Main {
    public static void main(String[] args) {
        char[] massive = {'q', 'w', 'e', 'r', 't'};
        char[] reversMassive = new char[massive.length];
        int j = massive.length-1;
        for (int i = 0; i < massive.length; i++) {
            reversMassive[i] = massive[j];
            j--;
        }
        for (int i = 0; i < reversMassive.length; i++) {
            System.out.println(reversMassive[i]);
        }
    }
}