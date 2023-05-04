package models;

import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class DateReservation{
    int year;
    int month;
    int day;
    int hour;
    int minute;

    public DateReservation(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public DateReservation(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public DateReservation(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public static DateReservation getDate(String stringDate,String stringTime){
        String[] tempDate = stringDate.trim().strip().split("-");
        int day = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int year = Integer.parseInt(tempDate[2]);
        String[]tempTime = stringTime.trim().split("-");
        int hour = Integer.parseInt(tempDate[0]);
        int minute = Integer.parseInt(tempDate[1]);
        return new DateReservation(day,month,year,hour,minute);
    }

    @Override
    public String toString() {
        return String.format("Дата резерва: %d-%d-%d | Время резерва: %d-%d",day,month,year,hour,minute);
    }
}
