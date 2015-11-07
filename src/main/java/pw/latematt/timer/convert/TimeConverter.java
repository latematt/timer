package pw.latematt.timer.convert;

/**
 * Java class used to convert milliseconds to different time measures and vice-versa.
 *
 * @author Matthew
 */
public class TimeConverter {
    /**
     * constants used in conversion (you should use these!)
     */
    public static final long SECOND = 1000,
            MINUTE = SECOND * 60,
            HOUR = MINUTE * 60,
            DAY = HOUR * 24,
            WEEK = DAY * 7;

    /**
     * Converts a time measurement to milliseconds.
     * @param amount the amount of a time measurement that needs to be converted
     * @param convertFrom the time measurement to convert to (you should use the constants!)
     * @return the time measurement to convert to * the amount of the time measurement
     */
    public long toMilliseconds(double amount, long convertFrom) {
        return convertFrom * (long) Math.floor(amount);
    }

    /**
     * Converts milliseconds to a time measurement.
     * @param milliseconds the milliseconds to convert
     * @param convertTo the time measurement to convert to
     * @return milliseconds / the time measurement to convert to
     */
    public double fromMilliseconds(long milliseconds, long convertTo) {
        return milliseconds / (double) convertTo;
    }
}
