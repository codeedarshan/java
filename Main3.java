import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char ch1 = sc.next().charAt(0);

        System.out.print("Enter second character: ");
        char ch2 = sc.next().charAt(0);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = (i % 2 == 1) ? ch1 : ch2;

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.print(" ");
        }

        sc.close();
    }
}