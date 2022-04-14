package com.company;


import java.util.Random;

public class Cars {

    Time time = new Time();
    private String mark;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    private String manufacturer;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    private int releaseIn;

    public void setReleaseIn(int year) {
        this.releaseIn = year;
    }

    public int getReleaseIn() {
        return releaseIn;
    }
    private int[] inspection_date = new int[3];

    public void setInspection_date(int inspection_year, int inspection_month, int inspection_day) {
        this.inspection_date[0] = inspection_year;
        this.inspection_date[1] = inspection_month;
        this.inspection_date[2] = inspection_day;
    }

    public int[] getInspection_date() {
        return inspection_date;
    }
    private int[] registration_date = new int[3];

    public void setRegistration_date(int registration_year, int registration_month, int registration_day) {
        this.registration_date[0] = registration_year;
        this.registration_date[1] = registration_month;
        this.registration_date[2] = registration_day;
    }

    public int[] getRegistration_date() {
        return registration_date;
    }

    public Cars(){
        Random random = new Random();
        String[] mark = {"Audi", "BMW", "Mercedes", "Volkswagen", "Toyota", "Mazda", "Nissan", "Opel", "Porsche", "Renault", "Subaru", "Suzuki", "Volvo"};
        this.setMark(mark[random.nextInt(mark.length)]);
        String[] manufacturer = {"Volkswagen Auto Group", "Toyota Motor Corp", "Honda Motor Corp", "Mazda Motor Corp", "Nissan Motor Corp", "Opel Automotive Ltd", "Porsche Automobilfabrik", "Renault Automotive", "Subaru Motor Corp", "Suzuki Motor Corp", "Volvo Corp"};
        this.setManufacturer(manufacturer[random.nextInt(manufacturer.length)]);
        String[] type = {"Sedan", "Hatchback", "Coupe", "Crossover", "SUV", "Pickup", "Minivan", "Cabriolet", "Convertible", "Truck", "Van", "Bus"};
        this.setType(type[random.nextInt(type.length)]);
        this.setReleaseIn(time.getYear(random.nextInt(10)+5));
        this.setInspection_date(time.getYear(random.nextInt(5)), time.getMonth(random.nextInt(time.getMonth()-1)), time.getDay(random.nextInt(time.getDay()-1)));
        this.setRegistration_date(time.getYear(time.getYear()-this.getReleaseIn()), time.getMonth(random.nextInt(time.getMonth()-1)), time.getDay(random.nextInt(time.getDay()-1)));
    }

    public Cars(String mark, String manufacturer, String type, int releaseIn, int[] inspection_date, int[] registration_date){
        this.setMark(mark);
        this.setManufacturer(manufacturer);
        this.setType(type);
        this.setReleaseIn(releaseIn);
        this.setInspection_date(inspection_date[0], inspection_date[1], inspection_date[2]);
        this.setRegistration_date(registration_date[0], registration_date[1], registration_date[2]);
    }

    public void carInfo(){
        if((time.getYear()-this.inspection_date[0]) < 1){
            System.out.println("\nMark: " + this.getMark());
            System.out.println("Manufacturer: " + this.getManufacturer());
            System.out.println("Type: " + this.getType());
            System.out.println("Release in: " + this.getReleaseIn());
            System.out.println("Inspection date: " + this.getInspection_date()[0] + "." + this.getInspection_date()[1] + "." + this.getInspection_date()[2]);
            System.out.println("Registration date: " + this.getRegistration_date()[0] + "." + this.getRegistration_date()[1] + "." + this.getRegistration_date()[2]);
        }else {
            System.out.println("\nТех осмотр не проводился в этом году у " + this.getMark());
        }
    }
}
