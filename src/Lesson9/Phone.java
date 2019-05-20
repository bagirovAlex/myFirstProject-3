package Lesson9;

public class Phone {
    // Переменные только относящиеся к типу данных, называют поля класса, описывают состояние объекта
    private double diagonal;
    private String model;
    private int prise;

    public void setPrise(int newPrise) {
        prise = newPrise;
    }

    public int getPrise() {
        return prise;
    }

    //методы на диаганаль
    public void setDiagonal(double newDiagonal) {
        diagonal = newDiagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    //методы на модель
    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }


}
