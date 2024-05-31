public class Main {
    public static void main(String[] args) {
        {
            int initialAmount = 0;
            int month = 0;
            while (initialAmount < 2_459_000) {
                initialAmount = initialAmount + initialAmount / 100;
                initialAmount += 15_000;
                month++;
                System.out.println("Месяц " + month + " сумма накоплений равна " + initialAmount + " рублей");
            }
        }
        System.out.println();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        {
            int birthRate = 17;
            int population = 12_000_000;
            int mortality = 8;
            for (int year = 1; year <= 10; year++) {
                population = population + (birthRate - mortality) * population / 1000;
                System.out.println("Год " + year + " численность населения составляет " + population);
            }
            System.out.println(" ");
            {
                int month = 1;
                int initialAmount = 15_000;
                while (initialAmount <= 12_000_000) {
                    initialAmount = initialAmount + (initialAmount * 7 / 100);
                    System.out.println("Месяц " + month + " сумма накоплений " + initialAmount);
                    month++;
                }
            }
            System.out.println(" ");
            {
                int month = 1;
                int sum = 15000;
                while (sum <= 12_000_000) {
                    int percent = sum * 7 / 100;
                    sum = sum + percent;
                    if (month % 6 == 0) {
                        System.out.println("Месяц " + month + " сумма накоплений " + sum);
                    }
                    month++;
                }
            }
            System.out.println(" ");
            {
                int month = 1;
                int sum = 15000;
                int date = 12 * 9;
                while (month <= date) {
                    int percent = sum * 7 / 100;
                    sum = sum + percent;
                    if (month % 6 == 0) {
                        System.out.println("Месяц " + month + " сумма накоплений " + sum);
                    }
                    month++;
                }
            }
            System.out.println(" ");
            for (int day = 3; day <= 31; day += 7) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
            System.out.println(" ");
            for (int year = 2024 - 200; year < 2024 + 100; year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }
    }
}