package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println("Вывести сведения о машинах, прошедших техосмотр менее года назад.");
        Time time = new Time();
        int[] inspection_date_car = {time.getYear(), time.getMonth(), time.getDay()};
        int[] registration_date_car = {time.getYear(), time.getMonth(), time.getDay()};
        Cars car = new Cars("BMW","Volkswagen Auto Group", "Sedan",2004,inspection_date_car, registration_date_car);
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();

        car.carInfo();
        car2.carInfo();
        car3.carInfo();
        car4.carInfo();
    }
}
