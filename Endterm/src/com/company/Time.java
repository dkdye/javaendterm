package com.company;

import java.time.LocalDateTime; // library for date & time recognition
import java.time.format.DateTimeFormatter; // library that formats local date & time

public class Time {
    public static void printCurrentDate(){

        System.out.print(java.time.LocalDate.now());
    }
    public static void printCurrentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm"); // the pattern of time formatting
        LocalDateTime now = LocalDateTime.now(); // let the code know what time is it now
        System.out.print(dtf.format(now)); // print the current time and date
    }
}
/*This class is responsible for printing current date & time.*/
