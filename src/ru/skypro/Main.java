package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание №1.
        int clientOS_1 = 0;
        if (clientOS_1 == 1){
            System.out.println("Установите версию приложения для Android по ссылке");

        } else if (clientOS_1 == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");

        }

        //Задание №2
        int clientOS = 1;
        int clientDeviceYear = 2014;
            if (clientDeviceYear >= 2015) {
                if (clientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }

            if (clientDeviceYear < 2015) {
                if (clientOS == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else if (clientOS == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            }

        //Задание №3

        int year = 2008;
        int ostat = year % 4;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("год является високосным " + year);

        }else {
            System.out.println("год не является високосным " + year);
        }
            //Задание 4
            int deliveryDistance = 95;
            int day = 0;
            if (deliveryDistance <= 20) {
                day = 1;
                System.out.println("Потребуется дней: " + day);
            }else if (deliveryDistance >20 &&deliveryDistance <60) {
                day = 2;
                System.out.println("Потребуется дней: " + day);
            }else if (deliveryDistance >=60 &&deliveryDistance <100) {
                day = 3;
                System.out.println("Потребуется дней: " + day);
            }
            //Задания №5
            int monthNumber = 12;
            switch (monthNumber){
                case 12:
                case 1:
                case 2:
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
                    System.out.println("Такого месяца нет");
            }




        }
}
