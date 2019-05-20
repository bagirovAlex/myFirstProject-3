//package Lesson10.Practic;
//
//import java.util.Scanner;
//
//public class Programm {
//    public static void main(String[] args) {
//        System.out.println("Выбирите фигуру:");
//        System.out.println("1 - треугольник");
//        System.out.println("2 - прямоугольник");
//
//        Scanner scanner = new Scanner();
//        String inputFigura = scanner.nextLine();
//
//        Figura figura = null;
//
//
//        if (inputFigura.equals("1")) {
//
//            System.out.println("Введите сторону треугольника А: ");
//            String storonaA = scanner.nextLine();
//
//            System.out.println("Введите сторону треугольника В: ");
//            String storonaB = scanner.nextLine();
//
//            System.out.println("Введите сторону треугольника С: ");
//            String storonaC = scanner.nextLine();
//
//            //переводим полученный стринг в число int
//            int strA = Integer.parseInt(storonaA);
//            int strB = Integer.parseInt(storonaB);
//            int strC = Integer.parseInt(storonaC);
//
//            figura = new Treugolnic(strA, strB, strC);
//
//        }
//
//        if (inputFigura.equals("2")) {
//
//            System.out.println("Введите сторону прямоугольника А: ");
//            String storonaA = scanner.nextLine();
//
//            System.out.println("Введите сторону прямоугольника В: ");
//            String storonaB = scanner.nextLine();
//
//            //переводим полученный стринг в число int
//            int strA = Integer.parseInt(storonaA);
//            int strB = Integer.parseInt(storonaB);
//
//            figura = new Primougolnic(strA, strB);
//        }
//
//        System.out.println("Периметр или площадь:");
//        String inputAction = scanner(System.in);
//
//        if (inputAction.equals("Периметр")) {
//            assert figura != null;
//            figura.printPloshad();
//        }
//        else {
//            assert figura != null;
//            figura.printPloshad();
//        }
//
//    }
//}
