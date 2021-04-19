package com.linghao.programming;

/**
 * @author zoulinghao
 * @create 2021-04-19-17:10
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 1000,"George");
        Account.setAnnualInterestRate(1.5/100);
        //存入30$
        account.deposit(30);
        //存入40$
        account.deposit(40);
        //存入50$
        account.deposit(50);
        //取出5$
        account.withDraw(5);
        //取出4$
        account.withDraw(4);
        //取出2$
        account.withDraw(2);
        System.out.println(account);

    }
}
