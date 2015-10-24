package pw.latematt.timer;

/**
 * This class is to help with converting time to milliseconds. Used in millisecond-related time measures.
 *
 * @author Matthew
 */
public class TimeConverter {
    private double second = 1000, minute = second * 60, hour = minute * 60, day = hour * 24, week = day * 7;

    /* x to milliseconds */
    public double daysToMilliseconds(double days) {
        return day * days;
    }

    public double hoursToMilliseconds(double hours) {
        return hour * hours;
    }

    public double minutesToMilliseconds(double minutes) {
        return minute * minutes;
    }

    public double secondsToMilliseconds(double seconds) {
        return second * seconds;
    }

    public double weeksToMilliseconds(double weeks) {
        return week * weeks;
    }

    /* milliseconds to x */
    public double millisecondsToDays(double milliseconds) {
        return milliseconds / day;
    }

    public double millisecondsToHours(double milliseconds) {
        return milliseconds / hour;
    }

    public double millisecondsToMinutes(double milliseconds) {
        return milliseconds / minute;
    }

    public double millisecondsToSeconds(double milliseconds) {
        return milliseconds / second;
    }

    public double millisecondsToWeeks(double milliseconds) {
        return milliseconds / week;
    }
}
