import java.time.LocalDate;

public class Main {


//    Задача 1

    public static void checkYearLear(int year){
        if (year % 4 == 0  && year % 100 != 0 || year % 400 == 0 && year % 100 != 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

//    Задача 2

    public  static  void checkOS(int OS){
       int clientDeviceYear = LocalDate.now().getYear();
        if (OS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите наше приложение для android по ссылке");
        } if (OS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите наше приложение для iphone по ссылке");
        } if (OS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

//    Задача 3

    public static int deliveryDays (int distance){
        int days = 0;
        if (distance <= 20){
            days = 1;
        } if (distance > 20 && distance <= 60) {
            days = 2;
        } if (distance > 60 && distance <= 100){
            days = 3;
        }
        return days;
    }







    public static void main(String[] args) {



//        Задача 1
        System.out.println("");
        System.out.println("Задача 1");

        int year = 1900;
        checkYearLear(year);

//        Задача 2
        System.out.println("");
        System.out.println("Задача 2");

        int android = 1;
        int iOS = 0;
        int OS = android;

        checkOS(OS);

//        Задача 3
        System.out.println("");
        System.out.println("Задача 3");

        int deliveryDistance = 100;
        int days = deliveryDays(deliveryDistance);
        if (deliveryDistance > 100){
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }







    }
}