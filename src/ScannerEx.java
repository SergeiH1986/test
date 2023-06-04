import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "Hello gjhh 123";
        Scanner scanner = new Scanner(new File("test.txt"));
        while (!scanner.hasNextInt())
            System.out.println(scanner.next());
    }
}
