public class Main {
    public static void main(String[] args) {
        int start = 700;
        int deposit = 1000;
        int bonus = deposit / 100;
        if (deposit < 1000) {
            System.out.println("На Вашем балансе " + (start + deposit) + " рублей");
        } else {
            System.out.println("На Вашем балансе " + (start + deposit + bonus) + " рублей," + " в том числе " + bonus + " бонусных баллов");
        }
    }
}