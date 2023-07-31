import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String existedNumber1 = scanner.nextLine();
        String existedNumber2 = scanner.nextLine();
        String existedNumber3 = scanner.nextLine();
        System.out.println(validate(transform(number), transform(existedNumber1)));
        System.out.println(validate(transform(number), transform(existedNumber2)));
        System.out.println(validate(transform(number), transform(existedNumber3)));
    }

    public static String transform(String number) {
        String transformedNumber = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) >= '0' && number.charAt(i) <= '9') {
                transformedNumber += number.charAt(i);
            }
        }
        if (transformedNumber.length() == 7) {
            return "495" + transformedNumber;
        } else {
            return transformedNumber.substring(1);
        }
    }

    public static String validate(String number, String existedNumber) {
        if (number.length() == existedNumber.length()) {
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) != existedNumber.charAt(i)) {
                    return "NO";
                }
            }
            return "YES";
        } else {
            return "NO";
        }
    }
}