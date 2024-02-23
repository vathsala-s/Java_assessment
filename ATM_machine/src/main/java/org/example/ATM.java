public class ATM {

    public static void main(String[] args) {
        System.out.println("\n Welcome to Automated Teller machine:) ");
    }
    private static void displayMenu() {
        while (true) {
            System.out.println("\n Main Menu: ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Withdraw");
                    System.out.print("Enter money to be withraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Please check your balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Deposit");
                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.print("Your money has been successfully deposited. ");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.print("Check Balance");
                    System.out.println("Balance : " + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.print("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Invalid option. ");
            }
        }
    }
    private static


}
