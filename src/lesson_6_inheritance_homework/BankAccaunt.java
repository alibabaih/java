package lesson_6_inheritance_homework;

import com.sun.java.swing.plaf.motif.resources.motif;

public class BankAccaunt {

    private String billOwner = "EMPTY";
    private double money = 0.0;

    public BankAccaunt() {}

    public BankAccaunt(String billOwner, double money) {
        this.billOwner = billOwner;
        this.money = money;
    }

    public String getBillOwner() {
        return billOwner;
    }

    public void setBillOwner(String billOwner) {
        this.billOwner = billOwner;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void deposit(double addMoney) {
        money = money + addMoney;
    }

    public void writeOff(double declineMoney) {
        if (money >= declineMoney) {
            money = money - declineMoney;
        }
    }

    public void show() {
        System.out.println(billOwner + " — " + money);
    }
}
