import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //Задание 1 про високосный год
        int year = 2021;
        boolean leapYear = examinationYear(year);
        if (leapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        System.out.println();

        //Задача 2. Предложить пользователю облегченную версию приложенния
        int clientOS = 2;
        int year1 = 2022;
        switch (getParametrs(clientOS, year1)) {
            case 1: System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 2: System.out.println("Установите облегченную версию приложения для iOS");
                break;
            case 3: System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 4: System.out.println("Установите облегченную версию приложения для Android");
                break;
        }
        System.out.println();

        // Задание 3. Срок доставки банковской карты
        int deliveryDistance = 100;
        int initialDistance = 20;
        int distanceStep = 40;
        int days = getPeriodOfDelivery(deliveryDistance, initialDistance, distanceStep);
        System.out.println("Потребуется дней - " + days);

    }
    public static boolean examinationYear(int year) {
        // Задание 1. Метод для определния високосного года
        boolean leapYear;
        leapYear = year % 4 == 0 && year / 100 != 0 || year % 400 == 0;
        return leapYear;
    }

    public static int getParametrs(int clientOS, int year1) {
        int osAndYear = 0;
        if (clientOS == 1 && year1 == LocalDate.now().getYear()) {
            osAndYear = 1; // iOS и обычная версия приложения
        }
        if  (clientOS == 1 && year1 < LocalDate.now().getYear()) {
            osAndYear = 2; // iOS и light версия приложения
        }
        if  (clientOS == 2 && year1 == LocalDate.now().getYear()) {
            osAndYear = 3; // Android и обычная версия приложения
        }
        if  (clientOS == 2 && year1 < LocalDate.now().getYear()) {
            osAndYear = 4; // Android и light версия приложения
        }
        return osAndYear;
    }

    public static int getPeriodOfDelivery (int deliveryDistance, int initialDistance, int distanceStep) {
        return (deliveryDistance - initialDistance) / distanceStep + 2;
    }
}