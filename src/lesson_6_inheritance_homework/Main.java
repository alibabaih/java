package lesson_6_inheritance_homework;

public class Main {

    public static void main(String[] args) {
        BankAccaunt acc_1 = new BankAccaunt();
        acc_1.setBillOwner("Vasiliy");
        acc_1.setMoney(100.43);
        BankAccaunt acc_2 = new BankAccaunt();
        acc_2.setBillOwner("Alex");
        acc_2.setMoney(54.74);

        acc_1.show();
        acc_2.show();
        acc_1.deposit(3.4);
        acc_2.setBillOwner("Larry");
        acc_1.show();
        acc_2.show();
    }

}
