package com.linghao.programming;

import java.util.Date;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:04
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class Transaction {
    private double amount;
    private double balance;
    private String description;
    private Date date;
    private char type;

    public Transaction(double amount, double balance, String description, char type) {
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.type = type;
        date=new Date();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", type=" + type +
                '}'+"\n";
    }
}
