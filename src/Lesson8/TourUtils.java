package Lesson8;

public class TourUtils {
    public static void printToursByOneCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0].equals(country)) {
                System.out.println(tours[i][0] + ", " + tours[i][1] + ", " + tours[i][2] + ", " + tours[i][3]);
                System.out.println();
            }
        }
    }

    //самый дорогой тур
    public static void printPriseMax(String[][] tours) {
        int maxPrise = 0;
        for (int i = 0; i < tours.length; i++) {
            int priseNum = Integer.parseInt(tours[i][1]);
            if (priseNum > maxPrise) {
                maxPrise = priseNum;
            }
        }
        System.out.println(maxPrise);
    }


    //Средняя стоимость всех туров
    public static void printAveragePrise(String[][] tour) {
        int sumTour = 0;

        for (int i = 0; i < tour.length; i++) {
            int priseNum = Integer.parseInt(tour[i][1]);
            sumTour += priseNum;
        }

        System.out.println(sumTour / tour.length);
    }
}
