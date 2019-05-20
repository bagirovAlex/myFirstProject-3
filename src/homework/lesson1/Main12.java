package homework.lesson1;
//Напишите кусочек кода,
// который будет заменять
// все согласные буквы на
// БОЛЬШИЕ БУКВЫ в строке
// "I am happy to learning java"

public class Main12 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";
        String text1 = text.replace("a", "A");
        String text2 = text1.replace("e", "E");
        String text3 = text2.replace("i", "I");
        String text4 = text3.replace("o", "O");
        String text5 = text4.replace("u", "U");
        String text6 = text5.replace("y", "Y");
        System.out.println(text6);
    }
}
