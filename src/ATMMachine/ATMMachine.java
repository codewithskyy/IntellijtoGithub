package ATMMachine;

import java.util.Scanner;

class ATM{
    public float balance;
    public int pin = 1234;

    ATM(int pin){
        this.pin = pin;
        System.out.println("Enter your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == pin) {
            menu();
        }
        else{
            System.out.println("Invalid Pin : Enter the Correct PIN");
        }
    }

    public void menu(){
        System.out.println("Enter your Choice : ");
        System.out.println("1 : Withdraw Money");
        System.out.println("2 : Deposit Money");
        System.out.println("3 : Check Account Balance");
        System.out.println("4 : Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1){
            withdrawMoney();
        }
        else if (option == 2)
        {
            depositMoney();
        }
        else if (option == 3)
        {
            checkAcBalance();
        }
        else if (option == 4)
        {
            return;
        }
        else
        {
            System.out.println("Select a Correct Option");
        }
    }

    public void checkAcBalance(){
        System.out.println("Balance : " + balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter the Amount for Withdrawl");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance){
            System.out.println("Insufficient Balance");
        } else{
            balance = balance - amount;
            System.out.println("Withdrawl Successful");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount to Deposit");
        Scanner sc = new Scanner(System.in);
        float depoamount = sc.nextFloat();
        balance = depoamount + balance;
        System.out.println("Money Deposited SuccessFully");
        menu();
    }
}
public class ATMMachine {
    public static void main(String[] args) {
          ATM obj = new ATM(1234);
    }
}
