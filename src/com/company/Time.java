package com.company;

import java.util.Date;

public class Time {
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getYear(int rewind) {
        return year-rewind;
    }

    private int month;

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getMonth(int rewind) {
        return month-rewind;
    }
    private int day;

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getDay(int rewind) {
        return day-rewind;
    }
    private int hour;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public int getHour(int rewind) {
        return hour-rewind;
    }
    private int minute;

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public int getMinute(int rewind) {
        return minute-rewind;
    }

    public Time(){
        Date date = new Date();
        this.setYear(date.getYear()+1900);
        this.setMonth(date.getMonth()+1);
        this.setDay(date.getDate());
        this.setHour(date.getHours());
        this.setMinute(date.getMinutes());
    }

    public void printTime(){
        System.out.println(this.getYear()+"/"+this.getMonth()+"/"+this.getDay()+" "+this.getHour()+":"+this.getMinute());
    }

    public void printTime(int rewind_year, int rewind_month, int rewind_day, int rewind_hour, int rewind_minute){
        System.out.println(this.getYear()+"/"+this.getMonth()+"/"+this.getDay()+" "+this.getHour()+":"+this.getMinute());
    }


}
