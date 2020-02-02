import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int[] tabToAdd = new int[5];

        System.out.println("Podaj 5 liczb całkowitych");
        tabToAdd[0] = sc.nextInt();
        tabToAdd[1] = sc.nextInt();
        tabToAdd[2] = sc.nextInt();
        tabToAdd[3] = sc.nextInt();
        tabToAdd[4] = sc.nextInt();

        int sum = tabToAdd[0]+tabToAdd[2]+tabToAdd[4];

        System.out.println("Suma liczb wynosi: " + sum);
        sc.close();
    }
}
