public class ATM {

    public static void main(String[] args) {
        System.out.println("\n Welcome to Automated Teller machine:) ");
    }
    private static void displayMenu() {
        while (true) {
            System.out.println("\n Main Menu: ");
            System.out.println("1. Choose language");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

        /*    switch (choice) {
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
            */
        }
    }
    public String chooseLanguage() {
        System.out.println("Choose language:");
        System.out.println("1. English");
        System.out.println("2. kannada");
        System.out.println("2. Hindi");
        int choice = Integer.parseInt(scanner.nextLine());
        String selectedLanguage;
        switch (choice) {
            case 1:
                System.out.println("You have chosen English.");
                selectedLanguage = "English";
                break;

            case 2:
                System.out.println("You have chosen kannada.");
                selectedLanguage = "kannada";
                break;
            case 2:
                System.out.println("You have chosen Hindi.");
                selectedLanguage = "Hindi";
            break;
            default:
                System.out.println("Invalid choice. ");
        }
        return selectedLanguage;


    }
    public static int withdraw(int balance, int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }
    public static int deposit(int balance, int depositAmount)
    {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }
    public static String verify_pin(int pinnumber){
        int balance = 10000;
        System.out.println("Please Enter your PIN number: ");
        String pin = Integer.toString(pinnumber);
        if(pin.length() == 4)
            System.out.println("Balance amount:" +balance);
        else {
            System.out.println("Please enter valid Pin. ");
        }
    }


}
