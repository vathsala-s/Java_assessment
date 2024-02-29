package ATM;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class ATMmachine {

    float Balance = 20000;
    int PIN = 4567;

    public void CheckPin() {
        System.out.println("\n Welcome to Automated Teller machine:) ");

        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            MainMenu();
        } else {
            System.out.println("Please enter a valid PIN. ");
        }
    }

    public void MainMenu() {

        System.out.println("1. Choose language");
        System.out.println("2. Account Information");
        System.out.println("3. Withdraw");
        System.out.println("4. Deposit");
        System.out.println("5. Check Balance");
        System.out.println("6. Change PIN");
        System.out.println("7. Exit");
        System.out.println("Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            ChooseLanguage();
        }
        if (choice == 2) {
            AccountInformation();
        } else if (choice == 3) {
            WithdrawMoney();
        } else if (choice == 4) {
            DepositMoney();
        } else if (choice == 5) {
            CheckBalance();
        } else if (choice == 6) {
            ChangePin();
        } else if (choice == 7) {
            return;
        } else {
            System.out.println("Please Enter a Valid Choice. ");
        }
    }

    public String ChooseLanguage() {
        System.out.println("Choose language:");
        System.out.println("1. English");
        System.out.println("2. kannada");
        System.out.println("3. Hindi");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        String selectedLanguage;
        switch (option) {
            case 1:
                System.out.println("You have chosen English.");
                selectedLanguage = "English";
                break;

            case 2:
                System.out.println("You have chosen kannada.");
                selectedLanguage = "kannada";
                break;
            case 3:
                System.out.println("You have chosen Hindi.");
                selectedLanguage = "Hindi";
                break;
            default:
                System.out.println("Invalid choice. ");
        }
        return selectedLanguage;
    }

    private void AccountInformation() {
        System.out.println("..");

    }

    private int WithdrawMoney() {
        System.out.println("Enter Amount to Withdraw = ");
        Scanner sc = new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();

        if (Balance >= withdrawAmount) {
            Balance = Balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
        } else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        MainMenu();
    }

    private int DepositMoney() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float depositAmount = sc.nextFloat();
        Balance = Balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        MainMenu();
    }

    private int CheckBalance() {
        System.out.println("Balance = " + Balance);
        MainMenu();
    }

    private int ChangePin() {
        System.out.println("Enter your current PIN number");
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print("Enter your 4 digit pin : ");
            PIN = Integer.parseInt(br.readLine());
            if (PIN != 4567) {
                System.out.println("Wrong PIN! Try again!");
                System.out.println("Attempts = 2");
                System.out.print("Enter your 4 digit pin : ");
                PIN = Integer.parseInt(br.readLine());
            }
            if (PIN != 4567) {
                System.out.println("Wrong PIN! Try again!");
                System.out.println("Attempts = 1");
                System.out.print("Enter your 4 digit pin : ");
                PIN = Integer.parseInt(br.readLine());
            }
            if (PIN != 4567) {
                System.out.println("Attempts = 0");
                System.out.println("YOUR ACCOUNT HAS BEEN LOCKED");
                break;
            } else {
                break;
            }
            MainMenu();
        }
    }
}
public class ATM {
    public static void main(String[] args) {
        ATMmachine obj = new ATMmachine();
        obj.CheckPin();
    }
}

    /* public static String verify_pin(int pinnumber){
        int balance = 10000;
        System.out.println("Please Enter your PIN number: ");
        String pin = Integer.toString(pinnumber);
        if(pin.length() == 4)
            System.out.println("Balance amount:" +balance);
        else {
            System.out.println("Please enter valid Pin. ");
        }
    }

     */