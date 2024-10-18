import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        String stringValue = scanner.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.printf("Ціле число: %d%nЧисло з плаваючою точкою: %f%nСтрока: %s%nЛогічне значення: %b%n",
                intValue, doubleValue, stringValue, booleanValue);

        System.out.println("\nString.format():");
        System.out.println(String.format("Десяткова: %d, Шістнадцяткова: %x, Вісімкова: %o", intValue, intValue, intValue));
        System.out.println(String.format("Число з плаваючою точкою: %.2f", doubleValue));
        System.out.println(String.format("Строка (мін. довжина 10): %-10s", stringValue));
        System.out.println(String.format("Логічне значення: %b", booleanValue));

        System.out.println("\nprintf():");
        System.out.printf("Десяткова: %d%nПлаваюча точка (3 знаки): %.3f%nСтрока (макс. 3 символи): %.3s%nЛогічне: %b%n",
                intValue, doubleValue, stringValue, booleanValue);

        System.out.printf("%nБез дробової частини: %.0f%n", doubleValue);
        System.out.printf("%nПравий край (ширина 8): %8d%n", intValue);
        System.out.printf("%nСтрока (макс. 4 символи): %.4s%n", stringValue);
        System.out.printf("%nЛогічне значення (нижній регістр): %b%n", booleanValue);
        System.out.printf("%nЛогічне значення (верхній регістр): %B%n", booleanValue);
        System.out.printf("%nЛівий край (ширина 10): %-10s%n", stringValue);
        System.out.println("\nДвійкова система: " + Integer.toBinaryString(intValue));
    }
}