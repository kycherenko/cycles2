public class Main {
    public static void main(String[] args) {
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total += 15000;
            month++;
        }
        {
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(" ");
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
                int mon = 1;
                int sum = 15000;
                while (sum <= 12_000_000) {
                    sum = sum + (sum * 7 / 100);
                    System.out.println("Месяц " + mon + " сумма накоплений " + sum);
                    mon++;
                }
            }
            System.out.println(" ");
            {
                int mon = 1;
                int sum = 15000;
                while (sum <= 12_000_000) {
                    sum = sum + (sum * 7 / 100);
                    if (mon % 6 == 0) {
                        System.out.println("Месяц " + mon + " сумма накоплений " + sum);
                    }
                    mon++;
                }
            }
            System.out.println(" ");
            {
                int mon = 1;
                int sum = 15000;
                while (mon <= 108) {
                    sum = sum + (sum * 7 / 100);
                    if (mon % 6 == 0) {
                        System.out.println("Месяц " + mon + " сумма накоплений " + sum);
                    }
                    mon++;
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