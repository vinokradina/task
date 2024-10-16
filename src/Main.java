import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList numbers = new ArrayList<>();

        System.out.println("Введите числа (0 для завершения):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        System.out.println("Несовпадающие числа в последовательности:");
        for (Object number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}