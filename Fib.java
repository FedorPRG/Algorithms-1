import java.util.Date;

public class Fib {

    public static int fib(int position) {
        if (position == 1 || position == 2) {
            return 1;
        }
        return fib(position - 1) + fib(position - 2);
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println(n);
        // Без рекурсии
        long start = System.nanoTime();
        int fib1 = 0;
        int fib2 = 1;
        int sum;
        System.out.print(fib2 + " ");
        for (int i = 1; i < n - 1; i++) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            System.out.print(sum + " ");
        }
        System.out.println();
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        // С рекурсией
        start = System.nanoTime();
        for (int i = 1; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);
    }
}
