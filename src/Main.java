public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        System.out.println(" Задача 1");
        char clientOst = 0;
        if (clientOst == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOst == 1) ;
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    private static void task2() {
        System.out.println(" Задача 2");
        char clientOst = 1;
        char clientDeviceYear = 2015;
        if (clientOst == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear > 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке ");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println(" Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static void task3() {
        System.out.println(" задача 3");
        int year = 2020;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(+year + " год является високосным");
        } else if (year % 4 == 0 && year / 100 > 0) {
            System.out.println(+year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(+year + " год не является високосным");
    } else {
            System.out.println(+ year+ " год не является високосным");


        }

    }

    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if ( deliveryDistance < 20){
            System.out.println(" доставка займет сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            System.out.println("Доставка займет двое суток");
        } else if ( deliveryDistance >= 60 && deliveryDistance <100) {
            System.out.println(" Доставка займет трое суток");
        } else {
            System.out.println(" Доставки нет");

        }

    }

    private static void task5() {
        System.out.println(" Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(+ monthNumber+ "принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(+ monthNumber+ "принадлежит к сезону весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(+ monthNumber+ "принадлежит к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(+ monthNumber+ "принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}













