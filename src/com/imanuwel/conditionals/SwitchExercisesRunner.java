package com.imanuwel.conditionals;

public class SwitchExercisesRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(0));
        System.out.println(isWeekDay(4));
    }

    private static boolean isWeekDay(int dayNumber) {
        // return dayNumber >= 1 && dayNumber <= 5;
        switch (dayNumber) {
            case 1, 2, 3, 4, 5:
                return true;
        }
        return false;
    }

    private static String determineNameOfMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Invalid Month";
    }

    private static String determineNameOfDay(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "Invalid Day";
    }
}
