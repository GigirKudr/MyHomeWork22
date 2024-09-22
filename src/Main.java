public class Main {
    public static void main(String[] args) {

        int clientMoney = 100;
        int summTransaktion = 1100;
        int condition = 1000;
        int summCondition = 100;
        if (summTransaktion < condition) {
            System.out.println("Балланс Вашего счёта составляет " + (clientMoney + summTransaktion) + " рублей");
            System.out.println("Бонусных баллов начисленно: 0");
        } else {
            System.out.println("Балланс Вашего счёта составляет " + ((clientMoney + summTransaktion) + (summTransaktion / summCondition)) + " рублей");
            System.out.println("Бонусных баллов начисленно: " + summTransaktion / summCondition);
        }
    }
}