package Lesson4;


public class Main5 {
    public static void main(String[] args) {
        String text = "I am,  learning  java!";
        String text1 = text.replace(",", " ");
        String text2 = text1.replace("  ", " ");

        String[] words = text2.split(" ");
        for (String currentText : words) {
            System.out.println(currentText);
        }

    }
}
