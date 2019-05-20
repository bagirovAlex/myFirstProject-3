package homework.lesson1;

public class StringUtils {
    //// Метод должен возвращать входящий текст (String text) в обратном порядке
    // вариант с переворачиванием символов
    public static String reverse(String text) {
        int stringlength = text.length();
        String result = "";
        for (int i = 0; i < stringlength; i++) {
            result = text.charAt(i) + result;
        }
        return result;
    }

    //Вариант с переворачиванием слов в String
    public static void reversWords(String text) {
        String[] words = text.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    //Метод должен возвращать количество гласных букв в тексте (String text),
    //учтите что метод должен считать как большие так и маленькие гласные буквы
    public static int countGlass(String text) {
        int stringlength = text.length();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'а' || text.charAt(i) == 'А' || text.charAt(i) == 'о' || text.charAt(i) == 'О'
                    || text.charAt(i) == 'у' || text.charAt(i) == 'У' || text.charAt(i) == 'э' || text.charAt(i) == 'Э'
                    || text.charAt(i) == 'ы' || text.charAt(i) == 'Ы' || text.charAt(i) == 'я' || text.charAt(i) == 'Я'
                    || text.charAt(i) == 'ё' || text.charAt(i) == 'Ё' || text.charAt(i) == 'е' || text.charAt(i) == 'Е'
                    || text.charAt(i) == 'ю' || text.charAt(i) == 'Ю' || text.charAt(i) == 'и' || text.charAt(i) == 'И') {
                sum++;
            }

        }
        return sum;
    }

    // Метод должен возвращать количество согласных букв в тексте (String text),
    // учтите что метод должен считать как большие так и маленькие буквы
    public static int countSoglasnie(String text){
        int stringlength = text.length();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'а' || text.charAt(i) == 'А' || text.charAt(i) == 'о' || text.charAt(i) == 'О'
                    || text.charAt(i) != 'у' || text.charAt(i) != 'У' || text.charAt(i) != 'э' || text.charAt(i) != 'Э'
                    || text.charAt(i) != 'ы' || text.charAt(i) != 'Ы' || text.charAt(i) != 'я' || text.charAt(i) != 'Я'
                    || text.charAt(i) != 'ё' || text.charAt(i) != 'Ё' || text.charAt(i) != 'е' || text.charAt(i) != 'Е'
                    || text.charAt(i) != 'ю' || text.charAt(i) != 'Ю' || text.charAt(i) != 'и' || text.charAt(i) != 'И') {
                sum++;
            }

        }
        return sum;
    }


}



