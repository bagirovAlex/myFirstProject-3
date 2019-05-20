package Lesson7;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Начали отсчет времени!");
        for(int year = 0;year < 5000;year++ ){
            for(int day = 0; day<366;day++){
                for(int hour = 0; hour<25;hour++){
                    for(int min = 0; min<61;min++){
                        for(int sec =0; sec<61;sec++){
                            System.out.printf("От старта прошло %d года, %d дня, %d часа, %d минуты, %d секунд", year, day,hour,min,sec);
                            System.out.println();
                            try {
                                Thread.sleep(1000); //задержка в цикле на 1 сек
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
