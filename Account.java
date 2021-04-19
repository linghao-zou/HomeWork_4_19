package com.linghao.programming;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:00
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class Account {
    private int id=0;
    private double balance =0;
    private static double annualInterestRate =0;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions= new ArrayList();

    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        dateCreated=new Date();
    }

    public Account() {
        dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated=new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return Account.getAnnualInterestRate()/12;
    }
    public double getMonthlyInterest(){
        return this.getBalance()*(1+this.getMonthlyInterestRate());
    }
    public void deposit(double money){
        balance+=money;
        transactions.add(new Transaction(money,balance,"deposit success",'D'));
    }
    public void withDraw(double money){
        balance-=money;
        transactions.add(new Transaction(money,balance,"withDraw success",'W'));
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ",annualInterestRate ='"+annualInterestRate+'\''+"\n"+
                ", transactions=" + transactions +
                '}';
    }
}
