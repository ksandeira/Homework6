public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным. ");
            }
        }

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Задание 8");
        int monthlySavings = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей.");
        }

        System.out.println("Задание 9");
        double monthlyDeposit = 29000;
        double annualRite = 0.12;
        double monthlyRite = annualRite / 12;
        double totalDeposit = 0;
        for (int month = 1; month <= 12; month++) {
            totalDeposit += monthlyDeposit;
            totalDeposit *= (1 + monthlyRite);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей.");
        }

        System.out.println("Задание 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }
}