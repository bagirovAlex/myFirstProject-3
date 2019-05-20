package Lesson5;

public class Main6 {
    public static void main(String[] args) {
        String text = "I can go home after curs!";
        String[] words = text.split(" ");
        String[] wordsRevers = new String[words.length];

//        wordsRevers[0] = words[2];
//        wordsRevers[1] = words[1];
//        wordsRevers[2] = words[0];

        for(int i=0, j=words.length-1; i<words.length;i++, j--){
            wordsRevers[i] = words[j];
            System.out.println(wordsRevers[i]);
        }


    }
}
