package homework.lesson1;
// Есть массив {a,b,c,d}.
// Нужно его "перевернуть задом наперед".
// По итогу получится другой массив

public class Main13 {
    public static void main(String[] args) {
        char[] massive = {'a', 'b', 'c', 'd'};
        char[] massive2 = new char[massive.length];
        for (int i = massive.length - 1; i >= 0; i--) {
            massive2[(massive.length-1)-i] = massive[i];
        }
        for (char current : massive2) {
            System.out.println(current);
        }
    }
}
