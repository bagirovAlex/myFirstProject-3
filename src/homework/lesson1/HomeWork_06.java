package homework.lesson1;

public class HomeWork_06 {
    public static void main(String[] args) {
//       int area = (int) MathUtils.areaTriangle(6,7,8);
//        System.out.println("Площадь треугольника = " + area);
//
//        int[] numbers = {4,44,77};
//        MathUtils.evenMassive(numbers);
//
//        MathUtils.summFraction(6,3,3,3);

        String text = "Метод должен возвращать входящий текст";
//        String revers = StringUtils.reverse(text);
//        System.out.println(revers);
//
//        StringUtils.reversWords(text);

        int countGlass = StringUtils.countGlass(text);
        System.out.println("Гласный в данном тексте: " + countGlass);

        int countSoglas = StringUtils.countSoglasnie(text);
        System.out.println("Согласных в данном тексте: " + countSoglas);

    }

}
