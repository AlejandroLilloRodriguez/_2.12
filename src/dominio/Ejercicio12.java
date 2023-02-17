package dominio;

public class Ejercicio12 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

