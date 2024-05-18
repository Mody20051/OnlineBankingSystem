package Resources;
import java.util.Scanner;
public class OnlineBankingSystem {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        OnlineBankingSystem onlineBankingSystem = new OnlineBankingSystem();
        Personalnformation personalnformation=new Personalnformation();

        onlineBankingSystem.start();
    }

    public void start() {
        int choice;
        do {
            System.out.println("\nWelcome!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                choice = 0;
            }

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    public void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter name (optional): ");

        String name = scanner.nextLine();

        System.out.println("Registration successful!");
    }

    public void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
//        if (user != null && user.getPassword().equals(password)){
//            System.out.println("Login successful!");
//        }
//        else{
//            System.out.println("Login failed. Please check username and password.");
//         }
        }
      }
