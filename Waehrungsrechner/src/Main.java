import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Betrag in Euro an: ");
        Double money = scanner.nextDouble();

        convertToDollars(money);
        convertToYen(money);
        convertToRubel(money);
    }

    public static void convertToDollars(double eur) {
        double tempo = eur * 1.02;
        System.out.println("Der Betrag in Dollar ist: " + tempo);
    }

    public static void convertToYen(double eur) {
        double tempo = eur * 138.28;
        System.out.println("Der Betrag in Yen ist: " + tempo);
    }

    public static void convertToRubel(double eur) {
        double tempo = eur * 64.26;
        System.out.println("Der Betrag in Russischer Rubel ist: " + tempo);
    }
}