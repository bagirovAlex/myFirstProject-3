package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int costTour = 20000;
        int money = 15000;

        boolean result = (costTour <= money) && (costTour <= 250000);
        System.out.println(result);
    }

}
