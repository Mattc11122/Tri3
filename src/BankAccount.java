/*
Matthew Cole
3/23/19
gives methods for getting name as well as changing name as well as the account type and account #, as well as fee method.


 */
import java.util.*;
public class BankAccount
{
    int acctNum;
    Scanner scan=new Scanner(System.in);
    private String name;
    private String accountType;
    private int balance;
    private int balanceFine;
String user;
    public String setName(String newName)
    {
        name = newName;
        return name;
    }
    public int setacctNum(int newAcctNum)
    {
        acctNum=newAcctNum;
        return acctNum;
    }

    public String setaccountType(String newAccountType)
    {
        accountType=newAccountType;
        return accountType;
    }
    public int setbalance(int newBalance)
    {
        balance=newBalance;
        while (balance<0)
        {
            System.out.println("Balance cannot be below 0. Please give new balance");
            balance=scan.nextInt();
        }
        return balance;
    }
    public int withdraw(int withdrawal)
    {
        balance=balance-withdrawal;
        return balance;
    }
    public BankAccount()
    {
        acctNum++;
    }
    public String getName()
    {
        return name;
    }
    public int getAcctNum() {
        return acctNum;
    }

    public BankAccount(String name, String accountType, int newBalance)
    {
        user=name;
        acctNum++;
        balance=newBalance;
    }
    public int deposit(int deposit)
    {
        balance=balance+deposit;
        return balance;
    }
    public void feeMethod()
    {
        if (balance<200)
        {
            System.out.println("Because your account has less than $200, you are subject to a 50 dollar fine.");
            balance=balance-50;
            System.out.println("Please deposit more to your account:");
            balanceFine=scan.nextInt();
            balance=balance+balanceFine;
            System.out.println("Your new balance is: $"+balance);
        }
    }
    public boolean equals(Object o)
    {
        if (o instanceof BankAccount)
        {
            return true;
        }
        else return false;
    }
    public String toString() {
        return "Hello "+name+", this account has the account number "+acctNum+". Your account type is "+accountType+". Your current balance is: $"+balance;
    }
}
