import java.util.Scanner;

public class TeacherUi implements Ui {

    public void getUi(LoginSystem loginSystem) {
        System.out.println("**Teacher UI**");
        System.out.println("Hi " +loginSystem.getLoggedUser().getName());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View courses");
            System.out.println("2. Add course");
            System.out.println("3. Remove course");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Your Courses:");
                    for (String course : ((Teacher)loginSystem.getLoggedUser()).getCourses()) {
                        System.out.println("- " + course);
                    }
                    break;
                case 2:
                    System.out.print("Enter course to add: ");
                    String courseToAdd = scanner.nextLine();
                    ((Teacher)loginSystem.getLoggedUser()).addCourses(courseToAdd);
                    System.out.println("Course added.");
                    break;
                case 3:
                    System.out.print("Enter course to remove: ");
                    String courseToRemove = scanner.nextLine();
                    ((Teacher)loginSystem.getLoggedUser()).removeCourses(courseToRemove);
                    System.out.println("Course removed.");
                    break;
                case 4:
                    loginSystem.logout();
                    System.out.println("Logged out.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            if (choice == 4) {
                break;
            }
        }
    }

}
