package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    final int SECONDS_IN_MIN = 60;
    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_DAY = 86400;

    Time() {
    }

    Time(int totalSeconds) {
        this.hours = totalSeconds % SECONDS_IN_DAY / SECONDS_IN_HOUR;
        this.minutes = totalSeconds % SECONDS_IN_HOUR / SECONDS_IN_MIN;
        this.seconds = totalSeconds % SECONDS_IN_MIN;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MIN + seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
