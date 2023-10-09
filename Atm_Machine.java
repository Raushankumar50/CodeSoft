import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double initialAmount) {
        balance = initialAmount;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    public void display() {
        System.out.println("Welcome to the ATM ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            display();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit : ");
                    double depositAmount = sc.nextDouble();
                    if (account.deposit(depositAmount)) {
                        System.out.println("Deposited: Rs" + depositAmount);
                    } else {
                        System.out.println("Deposit failed. Invalid amount. ");
                    }
                    break;
                case 2:
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawn: Rs " + withdrawAmount);
                    } else {
                        System.out.println("Withdrawal failed. Insufficient balance . ");
                    }
                    break;

                case 3:
                    System.out.println("Your account balance is: Rs " + account.checkBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Visit Again!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class Atm_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial account balance: Rs ");
        double initialBalance = sc.nextDouble();
        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}