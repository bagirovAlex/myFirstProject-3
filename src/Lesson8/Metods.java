package Lesson8;

//Сложить все числа в массиве которые деляться на 5
public class Metods {
    public static int summaChiselBy5(int[] massive) {
        int sumChiselBy5 = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 5 == 0) {
                sumChiselBy5 = sumChiselBy5 + massive[i];
            }
        }
        return sumChiselBy5;
    }


    //Выбрать из массива числа в составе которых есть указанное число
    public static int[] massiveWithNums(int[] massive, char chislo) {

        //Посдсчет количества числе в составе которого есть указанное число
        int countChisla = 0;
        for (int i = 0; i < massive.length; i++) {
            char[] chars = ("" + massive[i]).toCharArray();
            for (int j = 0; j <= chars.length; j++) {
                if (chars[j] == chislo) {
                    countChisla++; // счетчик
                    break;
                }
            }
        }
        int[] result = new int[countChisla]; // Создаем массив под выбранные числа на количество ячеек по счетчику посчитанному выше
        int index = 0;
        for (int i = 0; i < massive.length; i++) {//Делаем выборки из массива чисел
            char[] chars = ("" + massive[i]).toCharArray();//Для это приобразуем его в массив символов
            for (int j = 0; j <= chars.length; j++) {
                if (chars[j] == chislo) {//если число содержит нужный символ(цифру)
                    result[index] = chars[j];//тогда пишем в результирующий массив
                    index++;// чтобы менять строку массива ставим счетчик для следующего круга, сверху инициализация как 0
                }

            }
        }
        return result;
    }

    public static String getEqChars(String text1, String text2) {
        char[] charsFromText1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();

        String result = "";
        for (int i = 0; i < charsFromText1.length; i++) {
            for (int j = 0; j < charsFromText2.length; j++) {
                if (charsFromText1[i] == charsFromText2[j]) {
                    result += charsFromText1[i];
                    break;
                }
            }
        }
        return result;

    }

}
