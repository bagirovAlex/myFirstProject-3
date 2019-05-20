package Lesson8;

public class Main2 {
    public static void main(String[] args) {
        String[][] tours = {{"Greek", "15000", "polupansionat", "7days"},
                {"Spain", "45000", "hotel", "14days"},
                {"France", "100000", "hotel", "30days"},
                {"France", "50000", "appartment", "6days"}};

        TourUtils.printToursByOneCountry(tours,"France");

        TourUtils.printPriseMax(tours);
        TourUtils.printAveragePrise(tours);
    }
}
