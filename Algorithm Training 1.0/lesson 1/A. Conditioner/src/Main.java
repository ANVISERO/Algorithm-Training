import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte tRoom = scanner.nextByte();
        byte tCond = scanner.nextByte();
        String mode = scanner.next();
        switch (mode) {
            case "fan":
                System.out.println(tRoom);
                break;
            case "auto":
                System.out.println(tCond);
                break;
            case "freeze":
                if (tRoom > tCond) {
                    System.out.println(tCond);
                } else {
                    System.out.println(tRoom);
                }
                break;
            case "heat":
                if (tRoom < tCond) {
                    System.out.println(tCond);
                } else {
                    System.out.println(tRoom);
                }
        }
    }
}