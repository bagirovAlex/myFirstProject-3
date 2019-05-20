package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 4;
        if (a == b && b == c && c == a) {
            System.out.println("Это равностороний треугольник.");
        }else {
            System.out.println("Это точно не равностороний треугольник.");
        }
        if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b)) {
            System.out.println("Это равнобедренный треугольник.");
        }
        if (a != b && a != c){
            System.out.println("Это разносторний треугольник.");
        }

    }
}
