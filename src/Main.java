public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        int goal = 2_459_000;
        int monthPayment = 15_000;
        int total = 0;
        int month = 0;

        while (total < goal) {
            total += monthPayment;
            System.out.println("Месяц " + ++month
                    + " , сумма накоплений равно " + total + " рублей.");
        }
    }
    public static void task2() {
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }

        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3() {
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int years = 10;

        for (int year = 1; year <= years; year++) {
            population += population / 1000 *(birth - death);
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
    }
    public static void task4() {
        int goal = 12_000_000;
        float total = 15000;
        int percent = 7;

        for (int month = 0; total < goal; month++) {
            total += total * percent / 100;

            System.out.printf("В месяце %d накоплена сумма %.2f \n", month, total);
        }
    }
    public static void task5() {
        int goal = 12_000_000;
        float total = 15000;
        int percent = 7;

        for (int month = 1; total < goal; month++) {
            total += total * percent / 100;

            if (month % 6 == 0) {
                System.out.printf("В месяце %d накоплена сумма %.2f \n", month,total);
            }
        }
    }
    public static void task6() {
        int years = 9;
        int monthInYear = years * 12;
        float total = 15000;
        int percent = 7;

        for (int month = 1; month <= monthInYear; month++) {
            total += total * percent / 100;

            if (month % 6 == 0) {
                System.out.printf("В месяце %d накоплена сумма %.2f \n", month, total);
            }
        }
    }
    public static void task7() {
        int friday = 5;
        int daysInMonth = 31;
        for (; friday < daysInMonth; friday +=7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо " +
                    " подготовить отчет.");
        }
    }

    public static void task8() {
        int frequency = 79;
        int currentYear = 2023;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (int year = 0; year < afterYear; year += frequency) {
            if (year > beforeYear) {
                System.out.println(year);
            }
        }
    }
}