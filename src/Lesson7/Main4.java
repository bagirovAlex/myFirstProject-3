package Lesson7;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Какую операция необходимо сделать?");
        String operation = Calculator.getOperation();
        System.out.println(operation);

        System.out.println("Введите первое число:");
        int num = Calculator.GetNumber();
        System.out.println(num);

        System.out.println("Введите второе число:");
        int num2 = Calculator.GetNumber();
        System.out.println(num);

        Calculator.printResult(operation,num,num2);
    }
}
