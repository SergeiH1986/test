import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        int j = Integer.parseInt(reader.readLine());
        System.out.println("Сумма чисел равна ");
        System.out.println(i+j);

        }

    }
