import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int number) {
        if (number == 0) {
        return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }
}