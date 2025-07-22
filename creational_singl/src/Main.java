import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int initialChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (initialChoice) {
                case 1:
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();

                    if (loginSystem.login(username, password)) {//
                        System.out.println("You logged in!");
                         Ui u  = FactoryUi.factoryMehtod(password);
                        assert u != null;
                        u.getUi(loginSystem);

//while
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
