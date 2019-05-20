package Lesson5;

public class Main7 {
    public static void main(String[] args) {
        //Напечатать порядковый номер буквы
        String text = "Language java";
        char[] charFromText = text.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < charFromText.length; i++) {
            System.out.println(charFromText[i] + " - " + alphabet.indexOf(charFromText[i]));
        }
    }
}
