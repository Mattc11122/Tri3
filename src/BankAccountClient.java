/*
Matthew Cole
3/23/19
 */
import java.util.*;
public class BankAccountClient
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String newName;
        int newAcctNum;
        int newBalance;
        int withdraw;
        int deposit;
        String again;
        String transfer;
        String newAccountType;
        System.out.println("Please give your name:");
        newName=scan.next();
        System.out.println("Please give your account type:");
        newAccountType=scan.next();
        System.out.println("Please give your starting balance:");
        newBalance=scan.nextInt();
        BankAccount bank = new BankAccount();
        BankAccount bank2= new BankAccount();
        BankAccount bank3= new BankAccount();
        newAcctNum=1+bank.acctNum;
        bank.setacctNum(newAcctNum);
        bank.setName(newName);
        bank.setbalance(newBalance);
        bank.setaccountType(newAccountType);
        bank.feeMethod();
        System.out.println(bank);
        System.out.println("Would you like to make a new account?(Y/N)");
        again=scan.next();
        if (again.contains("y")||again.contains("Y")) {
            System.out.println("Please give your name:");
            newName = scan.next();
            System.out.println("Please give your account type:");
            newAccountType = scan.next();
            System.out.println("Please give your starting balance:");
            newBalance = scan.nextInt();
            newAcctNum=1+bank2.acctNum;
            bank2.setacctNum(newAcctNum);
            bank2.setName(newName);
            bank2.setbalance(newBalance);
            bank2.setaccountType(newAccountType);
            System.out.println(bank2);
            System.out.println("Would you like to make a new account?(Y/N)");
            again=scan.next();
            }
            System.out.println("Would you like to transfer money from account to account?(Y/N)");
            transfer = scan.next();
            if (bank.equals(bank2))
            {
                if (transfer.contains("y") || transfer.contains("Y")) {
                    System.out.println("Please give the account name of the first account that you would like to transfer funds from:");
                    String accountName1 = scan.next();
                    accountName1.toLowerCase();
                    int firstBank;
                    int accountNum;
                    if (accountName1.contains(bank.getName().toLowerCase())) {
                        firstBank = 1;
                    } else if (accountName1.contains(bank2.getName().toLowerCase())) {
                        firstBank = 2;
                    } else {
                        System.out.println("It does not appear that we have that account name in our database. You will have 1 more opportunity to give an account name that matches a name in our database:");
                        accountName1 = scan.next();
                        accountName1.toLowerCase();
                        if (accountName1.contains(bank.getName().toLowerCase())) {
                            firstBank = 1;
                        } else if (accountName1.contains(bank2.getName().toLowerCase())) {
                            firstBank = 2;
                        }
                        firstBank = 0;
                    }
                    if (firstBank == 1) {
                        System.out.println("Please give the name for the second account:");
                        String accountName2 = scan.next();
                        accountName2.toLowerCase();
                        if (accountName2.contains(bank2.getName().toLowerCase())) {
                            System.out.println("Please give the account number for the first account.");
                            accountNum = scan.nextInt();
                            if (accountNum == bank.getAcctNum()) {
                                System.out.println("You are transferring funds from an account under " + bank.getName() + " with the account number #" + bank.getAcctNum() + " to an account under " + bank2.getName());
                                System.out.println("How much would you like to transfer?");
                                withdraw = scan.nextInt();
                                deposit = scan.nextInt();
                                bank.withdraw(withdraw);
                                bank2.deposit(deposit);
                            }
                        } else {
                            System.out.println("It does not appear that we have that account name in our database. You will have 1 more opportunity to give an account name that matches a name in our database:");
                            accountName2 = scan.next();
                            accountName2.toLowerCase();
                            if (accountName2.contains(bank2.getName().toLowerCase())) {
                                System.out.println("Please give the account number for the first account.");
                                accountNum = scan.nextInt();
                                if (accountNum == bank.getAcctNum()) {
                                    System.out.println("You are transferring funds from an account under " + bank.getName() + " with the account number #" + bank.getAcctNum() + " to an account under " + bank2.getName());
                                    System.out.println("How much would you like to transfer?");
                                    withdraw = scan.nextInt();
                                    deposit = scan.nextInt();
                                    bank.withdraw(withdraw);
                                    bank2.deposit(deposit);
                                }
                            }
                        }
                    }
                    if (firstBank == 2) {
                        System.out.println("Please give the name for the second account:");
                        String accountName2 = scan.next();
                        accountName2.toLowerCase();
                        if (accountName2.contains(bank.getName().toLowerCase())) {
                            System.out.println("Please give the account number for the first account.");
                            accountNum = scan.nextInt();
                            if (accountNum == bank2.getAcctNum()) {
                                System.out.println("You are transferring funds from an account under " + bank2.getName() + " with the account number #" + bank2.getAcctNum() + " to an account under " + bank.getName());
                                System.out.println("How much would you like to transfer?");
                                withdraw = scan.nextInt();
                                deposit = scan.nextInt();
                                bank2.withdraw(withdraw);
                                bank.deposit(deposit);
                            }
                        } else {
                            System.out.println("It does not appear that we have that account name in our database. You will have 1 more opportunity to give an account name that matches a name in our database:");
                            accountName2 = scan.next();
                            accountName2.toLowerCase();
                            if (accountName2.contains(bank2.getName().toLowerCase())) {
                                System.out.println("Please give the account number for the first account.");
                                accountNum = scan.nextInt();
                                if (accountNum == bank.getAcctNum()) {
                                    System.out.println("You are transferring funds from an account under " + bank.getName() + " with the account number #" + bank.getAcctNum() + " to an account under " + bank2.getName());
                                    System.out.println("How much would you like to transfer?");
                                    withdraw = scan.nextInt();
                                    deposit = scan.nextInt();
                                    bank.withdraw(withdraw);
                                    bank2.deposit(deposit);
                                }
                            }
                        }
                    }
                    System.out.println(bank);
                    System.out.println(bank2);
                }

        }
        System.out.println("Have a nice day!");
    }
}
