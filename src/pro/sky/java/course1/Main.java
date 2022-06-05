package pro.sky.java.course1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //        Task_1
        int year = 2022;
        printLeapYear(year);

//        Task_2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        suggestVersion(clientOS, clientDeviceYear);

//        Task_3
        int deliveryDistance = 123;
        int numberOfDeliveryDays = numberOfDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + numberOfDeliveryDays);
    }
    private static int numberOfDeliveryDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + deliveryTime;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + deliveryTime + deliveryTime;
        }
        if (deliveryDistance > 100) {
            deliveryTime = deliveryTime + deliveryTime + deliveryTime + deliveryTime;
        }
        return deliveryTime;
    }
    public static void suggestVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear < clientDeviceYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите новое приложение для ");
        }
        if (clientOS == 1) {
            System.out.println("Android по ссылке.");
        } else {
            System.out.println("iOS по ссылке");
        }
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printLeapYear(int year) {
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println();
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год - не високосный.");
        }
    }
}
