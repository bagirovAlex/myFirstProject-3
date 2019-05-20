package Lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "qwertyhh";
        char[] simbolsFromText = text.toCharArray();

        for(int i = 0; i < simbolsFromText.length;i++) {

            if (!((simbolsFromText[i] == 'e') || (simbolsFromText[i] == 'y'))){
                char result = simbolsFromText[i];
               System.out.println(result);
           }

        }
    }
}