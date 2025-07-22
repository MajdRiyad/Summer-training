import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee ;
        boolean running = true;

        while (running) {
            System.out.println("1. Menu");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Espresso");
                    System.out.println("2. Mocha");
                    System.out.print("Choose a coffee type: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            coffee = new Espresso();
                            break;
                        case 2:
                            coffee = new Mocha();
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                            continue;
                    }

                    boolean addMore = true;
                    while (addMore) {

                        System.out.println("Would you like to add anything?");
                        System.out.println("1. Milk");
                        System.out.println("2. Sugar");
                        System.out.println("3. No, that's all");
                        System.out.print("Choose an option: ");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                coffee = new WithMilk(coffee);
                                break;
                            case 2:
                                coffee = new WithSuger(coffee);
                                break;
                            case 3:
                                addMore = false;
                                break;
                            default:
                                System.out.println("Invalid choice, please try again.");
                        }
                    }

                    System.out.println("Your order: " + coffee.getDescription());
                    System.out.println("Total cost: $" + coffee.cost());
                    break;

                case 2:
                    running = false;
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}