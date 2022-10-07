public class Main {
    public static void main(String[] args) {
        System.out.println("Итоговый счет включая бонусные рубли");
        int account = 300;
        int addingAccount = 100;
        boolean bonus = addingAccount > 1000;

        int balance;
        if (bonus) {
            balance = addingAccount / 100;

        } else {
            balance = 0;
        }

        int total = account + addingAccount + balance;
        System.out.println(total);
    }
}