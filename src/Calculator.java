import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char co = 'c';
        double peremenay1;
        double peremenay2;
        char operation;
        double result = 0;
        do {
            if (co == 'c') {
                System.out.println("Введите первое число");
                peremenay1 = sc.nextInt();
                System.out.println("Введите знак");
                operation = sc.next().charAt(0);
            } else {
                peremenay1 = result;
                operation = co;
            }

            System.out.println("Введите второе число");
            peremenay2 = sc.nextInt();

            result = calculate(peremenay1, operation, peremenay2);

            System.out.println(result);
            co = sc.next().charAt(0);
        } while (co != 's');
    }

    public static double calculate(double peremenay1, char operation, double peremenay2) {
        return switch (operation) {
            case '+' -> peremenay1 + peremenay2;
            case '-' -> peremenay1 - peremenay2;
            case '*' -> peremenay1 * peremenay2;
            case '/' -> peremenay1 / peremenay2;
            default -> {
                System.out.println("Некорректный знак");
                yield 0;
            }
        };
    }
}
