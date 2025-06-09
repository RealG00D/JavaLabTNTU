import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (i % 2 == 0) {
                    if (Character.isUpperCase(ch)) {
                        result.append(Character.toLowerCase(ch));
                    } else {
                        result.append(Character.toUpperCase(ch));
                    }
                } else {
                    result.append(ch);
                }
            } else {
                result.append(ch);
            }
        }

        System.out.println("Результат з почергово зміненим регістром: " + result.toString());
    }
}
