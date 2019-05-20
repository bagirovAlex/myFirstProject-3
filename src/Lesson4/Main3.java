package Lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String login = "qwerty";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите логин:");
        String inputLogin = scanner.nextLine();
        System.out.println("Введите пароль:");
        String inputPassword = scanner.nextLine();

        if(login.equalsIgnoreCase(inputLogin) && password.equalsIgnoreCase(inputPassword)){
            System.out.println("Вход выполнен.");
        }else {
            System.out.println("Неверно");
        }
    }
}
