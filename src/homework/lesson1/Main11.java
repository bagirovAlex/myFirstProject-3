package homework.lesson1;
//         Напишите кусочек кода,
//         который выводит на консоль каждое
//         слово из текста
//         "I am happy to learning java"
//         , только в обратном порядке
public class Main11 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";
        String[] words = text.split(" ");

//        for(String curText:words){
//            System.out.println(curText);
//        }
        int a = words.length;
        for(int i=words.length-1; i>=0;i--){
            System.out.println(words[i]);
        }
    }
}
