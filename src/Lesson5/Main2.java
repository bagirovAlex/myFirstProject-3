package Lesson5;

public class Main2 {
    public static void main(String[] args) {
        //Указать количество букв в тексте
        String text = "Are you ready to start study?";
        char[] alfavit = "abcdefghijklmnoprstuvwxyz".toCharArray();

        int[] count = new int[alfavit.length];
        for (int i = 0; i < alfavit.length; i++) {
            int countCurrentChar = 0;
            for (int j = 0; j < text.length(); j++) {
                if (alfavit[i] == text.charAt(j)) {
                    countCurrentChar++;
                }
            }
            count[i] = countCurrentChar;
        }
        for (int i = 0; i < alfavit.length; i++) {
            System.out.println(alfavit[i] + " - " + count[i]);
        }
    }
}