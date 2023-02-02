
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 424;
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("год является високосным");

        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("год является високосным");

        else if (year % 100 == 0)
            System.out.println("год не является високосным");

        else
            System.out.println("год не является високосным");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int daysCount = 0;
        int distance = 34;
        if (distance > 0 && distance <= 20) {
            daysCount++;
            System.out.println("Потребуется дней: " + daysCount);
        } else if (distance > 20 && distance <= 60) {
            daysCount += 2;
            System.out.println("Потребуется дней: " + daysCount);
        } else if (distance > 60 && distance <= 100) {
            daysCount += 3;
            System.out.println("Потребуется дней: " + daysCount);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int numberMonth = 7;
        switch (numberMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}