import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<Integer> uniqueNumbers = new HashSet<>();

            System.out.println("Введите последовательность чисел (введите 0 для завершения):");
            while (true) {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                uniqueNumbers.add(num);
            }

            System.out.println("Несовпадающие числа:");
            uniqueNumbers.forEach(System.out::println);

            if (!uniqueNumbers.isEmpty()) {
                int maxNumber = max(uniqueNumbers);
                System.out.println("Максимальное число: " + maxNumber);
            } else {
                System.out.println("Последовательность пуста.");
            }
        }
    }

    public static <E extends Comparable<E>> E max(Set<E> set) {
        if (set == null || set.isEmpty()) {
            throw new IllegalArgumentException("Пустое значение или ноль");
        }

        return set.stream()
                .max(Comparable::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Пустое значение или ноль"));
    }
}