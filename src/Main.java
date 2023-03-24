public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1100;
        int minDeposit = 1000;
        int rate = 100;
        int bonus = 0;

        if (deposit > minDeposit) {
            bonus = deposit / rate;
            balance = balance + deposit + bonus;
            System.out.println("Ваш баланс " + balance + ". Вам начислено " + bonus + " бонусных рублей.");
        } else {
            balance = balance + deposit;
            System.out.println("Ваш баланс " + balance + ". Вам начислено " + bonus + " бонусных рублей.");
        }
    }
}