package pw.latematt.timer.test;

import pw.latematt.timer.Timer;
import pw.latematt.timer.convert.TimeConverter;

/**
 * @author Matthew
 */
public class TimeConverterTest {
    public static void main(String... args) {
        System.out.println("TimeConverter Test");
        System.out.println("http://latematt.pw");
        System.out.println();

        Timer timer = new Timer(); // might as well end the program with a timer of how long it took to test ;)
        TimeConverter converter = new TimeConverter();
        long second = 1000; // 1 second in milliseconds
        System.out.println(String.format("\tSecond: %s seconds (should return 1.0 seconds)", converter.fromMilliseconds(second, TimeConverter.SECOND)));
        second += 500; // half a second added to it
        System.out.println(String.format("\tSecond + half a second: %s seconds (should return 1.5 seconds)", converter.fromMilliseconds(second, TimeConverter.SECOND)));

        // testing toMilliseconds
        System.out.println(String.format("\t1 day in milliseconds: %s (should return 86400000)", converter.toMilliseconds(1, TimeConverter.DAY)));

        System.out.println();
        System.out.println(String.format("TimeConverter Test finished in %s seconds.", converter.fromMilliseconds(timer.getDifference(), TimeConverter.SECOND)));
    }
}
