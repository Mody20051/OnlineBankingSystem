package Resources;

import java.util.Date;

public class Vipcustomer extends Account {

    public Vipcustomer(String name,String password,String email,int phonenum, String address, Gender gender, int id, double balance, String account) {
        super(name,password,email,phonenum,address,gender,id, balance, account);
    }
    final static int INTERSET=15;
    @Override
    public void applyInterest() {
        try {
            double BalanceInterset = getBalance() * INTERSET / 100.0;
            System.out.println("Interest earned: " + BalanceInterset);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deposit(double money) {
        double getInterset = INTERSET / 100.0;
        if (money > 0) {
            double balance =getBalance()+(getBalance()*getInterset);
            balance+=money;
            TransactionsType.add(new Transactions(Type.Deposit,Status.SuccessfullyCompleted,money,new Date()));
        }else{
            TransactionsType.add(new Transactions(Type.Deposit,Status.Failed,money,new Date()));
        }
    }

    @Override
    public void transfer(double money, Account targetAccount) {
        double balance =getBalance();
        if (money > 0 && balance >= money) {
            balance -= money;
            targetAccount.deposit(money);
            TransactionsType.add(new Transactions(Type.Transfer,Status.SuccessfullyCompleted,money,new Date()));
        } else {
            TransactionsType.add(new Transactions(Type.Transfer,Status.SuccessfullyCompleted,money,new Date()));
        }
    }

    @Override
    public void withdraw(double money) {
        double balance =getBalance();
        if (money > 0 && balance >= money) {
            balance -= money;
            TransactionsType.add(new Transactions(Type.Withdraw,Status.SuccessfullyCompleted,money,new Date()));
        } else {
            TransactionsType.add(new Transactions(Type.Withdraw,Status.SuccessfullyCompleted,money,new Date()));
        }
    }
    public double getBalance() {
        return getBalance();
    }
    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + getBalance() +
                ", transactions=" + getTransactions() +
                '}';
    }
 }
