import java.util.Scanner;

public class EpicureanBlissBistro {

    private int totalBill = 0;
    private StringBuilder order = new StringBuilder();

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayStarters();
                    break;
                case 2:
                    displayMainCourse();
                    break;
                case 3:
                    displayBeverages();
                    break;
                case 4:
                    printBill();
                    return;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("What would you like to have?\n");
        System.out.println("MAIN MENU");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Beverages");
        System.out.println("4. Generate Bill");
        System.out.println("5. Exit");
    }

    private void displayStarters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for veg\n2 for non-veg");
        int s = sc.nextInt();

        if (s == 1) {
            System.out.println("Here are some veg starters:\n");
            System.out.println("1. Honey chilli potato -> 60");
            System.out.println("2. Spring rolls -> 40");
            System.out.println("3. Paneer tikka -> 150");
            System.out.println("4. Veg taco -> 80");
            System.out.println("5. Return to main menu\n");
        } else if (s == 2) {
            System.out.println("Here are some non-veg starters:\n");
            System.out.println("1. Chilli chicken -> 220");
            System.out.println("2. Chicken kabab -> 80");
            System.out.println("3. Chicken tikka -> 249");
            System.out.println("4. Chicken lollipop -> 269");
            System.out.println("5. Return to main menu\n");
        } else {
            System.out.println("Invalid choice. Please enter a valid option.");
            return;
        }

        System.out.print("Enter your choice (1-5): ");
        int choice1 = sc.nextInt();

        switch (choice1) {
            case 1:
                if (s == 1) {
                    order.append("1 Honey chilli potato -> 60\n");
                    totalBill += 60;
                    System.out.println("1 Honey chilli potato added to your order.");
                } else {
                    order.append("1 Chilli chicken -> 220\n");
                    totalBill += 220;
                    System.out.println("1 Chilli chicken added to your order.");
                }
                break;
            case 2:
                if (s == 1) {
                    order.append("1 Spring rolls -> 40\n");
                    totalBill += 40;
                    System.out.println("1 Spring rolls added to your order.");
                } else {
                    order.append("1 Chicken kabab -> 80\n");
                    totalBill += 80;
                    System.out.println("1 Chicken kabab added to your order.");
                }
                break;
            case 3:
                if (s == 1) {
                    order.append("1 Paneer tikka -> 150\n");
                    totalBill += 150;
                    System.out.println("1 Paneer tikka added to your order.");
                } else {
                    order.append("1 Chicken tikka -> 249\n");
                    totalBill += 249;
                    System.out.println("1 Chicken tikka added to your order.");
                }
                break;
            case 4:
                if (s == 1) {
                    order.append("1 Veg taco -> 80\n");
                    totalBill += 80;
                    System.out.println("1 Veg taco added to your order.");
                } else {
                    order.append("1 Chicken lollipop -> 269\n");
                    totalBill += 269;
                    System.out.println("1 Chicken lollipop added to your order.");
                }
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private void displayMainCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for veg\n2 for non-veg");
        int s = sc.nextInt();

        if (s == 1) {
            System.out.println("Here are some veg items:\n");
            System.out.println("1. Dal makhani -> 219");
            System.out.println("2. Paneer butter masala -> 229");
            System.out.println("3. Veg kadi -> 180");
            System.out.println("4. Veg handi -> 339");
            System.out.println("5. Return to main menu\n");
        } else if (s == 2) {
            System.out.println("Here are some non-veg items:\n");
            System.out.println("1. Butter chicken -> 370");
            System.out.println("2. Kadai chicken -> 350");
            System.out.println("3. Chicken curry -> 350");
            System.out.println("4. Egg curry -> 250");
            System.out.println("5. Return to main menu\n");
        } else {
            System.out.println("Invalid choice. Please enter a valid option.");
            return;
        }

        System.out.print("Enter your choice (1-5): ");
        int choice1 = sc.nextInt();

        switch (choice1) {
            case 1:
                if (s == 1) {
                    order.append("1 Dal makhani -> 219\n");
                    totalBill += 219;
                    System.out.println("1 Dal makhani added to your order.");
                } else {
                    order.append("1 Butter chicken -> 370\n");
                    totalBill += 370;
                    System.out.println("1 Butter chicken added to your order.");
                }
                break;
            case 2:
                if (s == 1) {
                    order.append("1 Paneer butter masala -> 229\n");
                    totalBill += 229;
                    System.out.println("1 Paneer butter masala added to your order.");
                } else {
                    order.append("1 Kadai chicken -> 350\n");
                    totalBill += 350;
                    System.out.println("1 Kadai chicken added to your order.");
                }
                break;
            case 3:
                if (s == 1) {
                    order.append("1 Veg kadi -> 180\n");
                    totalBill += 180;
                    System.out.println("1 Veg kadi added to your order.");
                } else {
                    order.append("1 Chicken curry -> 350\n");
                    totalBill += 350;
                    System.out.println("1 Chicken curry added to your order.");
                }
                break;
            case 4:
                if (s == 1) {
                    order.append("1 Veg handi -> 339\n");
                    totalBill += 339;
                    System.out.println("1 Veg handi added to your order.");
                } else {
                    order.append("1 Egg curry -> 250\n");
                    totalBill += 250;
                    System.out.println("1 Egg curry added to your order.");
                }
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private void displayBeverages() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here are some beverages:\n");
        System.out.println("1. Virgin mojito -> 149");
        System.out.println("2. Pina colada -> 129");
        System.out.println("3. Sex on the beach -> 149");
        System.out.println("4. Cold coffee -> 140");
        System.out.println("5. Return to main menu\n");
        System.out.print("Enter your choice (1-5): ");
        int choice1 = sc.nextInt();

        switch (choice1) {
            case 1:
                order.append("1 Virgin mojito -> 149\n");
                totalBill += 149;
                System.out.println("1 Virgin mojito added to your order.");
                break;
            case 2:
                order.append("1 Pina colada -> 129\n");
                totalBill += 129;
                System.out.println("1 Pina colada added to your order.");
                break;
            case 3:
                order.append("1 Sex on the beach -> 149\n");
                totalBill += 149;
                System.out.println("Sex on the beach added to your order.");
                break;
            case 4:
                order.append("1 Cold coffee -> 140\n");
                totalBill += 140;
                System.out.println("Cold coffee added to your order.");
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private void printBill() {
        System.out.println("\nBILL:");
        System.out.println(order.toString() + "Total Bill: " + totalBill + " Rs.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Epicurean Bliss Bistro");
        System.out.println("Open menu?");
        System.out.println("Type yes or no");
        String option = sc.next();

        if (option.equalsIgnoreCase("yes")) {
            EpicureanBlissBistro orderSystem = new EpicureanBlissBistro();
            orderSystem.takeOrder();
        } else if (option.equalsIgnoreCase("no")) {
            System.out.println("Thank you for coming! Please visit us again!");
        } else {
            System.out.println("Please check your answer.");
        }
    }
}
