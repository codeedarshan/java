import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("G Wagon");
                break;

            case 2:
                System.out.println("BMW");
                break;

            case 3:
                System.out.println("Mercedes");
                break;

            case 4:
                System.out.println("Your choice, I don't know!");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}