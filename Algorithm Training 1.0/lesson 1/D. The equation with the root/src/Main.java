import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        solve(a, b, c);
    }

    public static void solve(int a, int b, int c) {
        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else {
            if (a == 0) {
                if (Math.pow(c, 2) == b) {
                    System.out.println("MANY SOLUTIONS");
                } else {
                    System.out.println("NO SOLUTION");
                }
        } else if ((Math.pow(c, 2) - b) / a == (double) ((c * c - b) / a)) {
                System.out.println((int)(Math.pow(c, 2) - b) / a);
            } else {
                System.out.println("NO SOLUTION");
            }
        }
    }
}