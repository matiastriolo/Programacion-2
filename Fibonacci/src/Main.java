import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero para realizar la susecino: ");
        int n = sc.nextInt();

        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

    }
}