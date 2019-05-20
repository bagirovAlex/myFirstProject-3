package Lesson5;

public class Main1 {
    public static void main(String[] args) {
        ////Есть массив букв {a,b,c,d} и {q,w,e,r}.
////   Так же у нас есть предложение "Are you ready to start studying of programming?"
////   Нам нужно переписать каждый символ "а" на символ "q", символ "b" на "w" и т.д... (на символ стоящий во втором массиве на такой же позиции
////   как и в первом массиве).
////   По окончании у вас получится предложение : "qre you reqry to stqrt sturying of progrqmming?"
        char[] massive = {'q', 'w', 'e', 'r'};
        char[] massive2 = {'a', 'b', 'c', 'd'};

        char[] massive3 = {'Q', 'W', 'E', 'R'};
        char[] massive4 = {'A', 'B', 'C', 'D'};

        String text = "Are you ready to start studying of programming?";
        char[] textMassive = text.toCharArray();

        for (int i = 0; i < textMassive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (textMassive[i] == massive[j]) {
                    textMassive[i] = massive2[j];
                }
            }
        }

        for (int i = 0; i < textMassive.length; i++) {
            for (int j = 0; j < massive3.length; j++) {
                if (textMassive[i] == massive3[j]) {
                    textMassive[i] = massive4[j];
                }
            }
        }


        for (int i = 0; i < textMassive.length; i++) {
            System.out.print(textMassive[i]);
        }
    }
}
