package Week4;

import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

public class Student {
    private String name;
    private int year, month, day;

    public Student() {
    }

    public Student(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Student(String name, int year) {
        Random rndNum = new Random();
        this.name = name;
        this.year = year;
        this.month = rndNum.nextInt(12) + 1;
        int maxDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 2: {
                if (this.year % 4 == 0) {
                    maxDay = 29;
                    break;
                } else {
                    maxDay = 28;
                    break;
                }
            }
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
        }
        this.day = rndNum.nextInt(maxDay) + 1;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean checkDate() {
        if (this.year % 4 == 0 && this.month == 2) {
            if (this.day > 29)
                return false;
            else
                return true;
        }

        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day > 31 || this.day < 0) {
                    return false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day > 30 || this.day < 0) {
                    return false;
                }
                break;

            case 2:
                if (this.day > 28)
                    return false;
                break;

        }

        if (this.month > 13 || this.month < 0)
            return false;

        return true;
    }

    public int calAge() {
        Calendar cal = Calendar.getInstance();
        int comYear = cal.get(Calendar.YEAR);
        int comMonth = cal.get(Calendar.MONTH) + 1;
        int comDay = cal.get(Calendar.DATE);

        int comAge = comYear - this.year;

        if (this.month < comMonth)
            return comAge;

        else if (this.month == comMonth) {
            if (this.day <= comDay)
                return comAge;
            else
                return comAge - 1;
        } else
            return comAge - 1;
    }

    public boolean isOlder(Student stu) {
        if (this.calAge() > stu.calAge())
            return true;

        else if (this.calAge() == stu.calAge()) {
            if (this.month < stu.month)
                return true;
            else if (this.month > stu.month)
                return false;
            else if (this.month == stu.month) {
                if (this.day < stu.day)
                    return true;
                else
                    return false;
            } else
                return false;
        } else
            return false;

    }
}



