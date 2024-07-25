import java.time.LocalDate;

public static void main(String[] args) {
    System.out.println("Задача 1");
    countLeapYear();
    int year = LocalDate.now().getYear();
    //Задача 1: Выяснить, високосный ли введенный год
    if (year <= 1584) {
        System.out.println("Високосные года еще не введены!");
    } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " год является високосным");
    } else {
        System.out.println(year + " год не является високосным");
    }

}

static void countLeapYear() {
}

//Задача 2: Узнать версию устройства и год выпуска устройства, вывести нужное значение
public static int devVersion(int ver) {
    System.out.println("Задача 2");
    int deviceYear = LocalDate.now().getYear();
    if (ver == 0 && deviceYear < 2015) {
        return 1;
    } else if (ver == 0 && deviceYear >= 2015) {
        return 2;
    } else if (ver == 1 && deviceYear < 2015) {
        return 3;
    } else if (ver == 1 && deviceYear >= 2015) {
        return 4;
    }
    return ver;
}

static void deviceOs(int args) {
    int ver = 0;
    int deviceVersion = devVersion(ver);
    if (deviceVersion == 1) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (deviceVersion == 2) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (deviceVersion == 3) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (deviceVersion == 4) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    deviceOs(deviceVersion);
}


public static int distanceTime(int km) {
    if (km <= 20) {
        return 1;
    } else if (km > 20 && km < 60) {
        return 2;
    } else if (km >= 60 && km < 100) {
        return 3;
    } else {
        return 0;
    }
}

public static char delivery(int args) {
    int deliveryDistance = 50;
    int days = distanceTime(deliveryDistance);
    if (days > 0) {
        System.out.println("Потребуется дней: " + days + " срок доставки.");
    } else {
        System.out.println("Доставки нет.");
    }

    System.out.print(delivery(days));
    return 0;
}