package pw.latematt.timer.test;

import pw.latematt.timer.Timer;
import pw.latematt.timer.convert.TimeConverter;

/**
 * @author Matthew
 */
public class TimerTest {
    public static void main(String... args) {
        long sleep = 500; // 500 ms of sleep
        System.out.println("Timer Test");
        System.out.println("http://latematt.pw");
        Timer timer = new Timer();
        try {
            System.out.println();
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("\tSystem time: %s", timer.getCurrentTime()));
        System.out.println(String.format("\tLast reset time: %s", timer.getLastTime()));
        System.out.println(String.format("\tDifference: %s", timer.getDifference()));
        System.out.println(String.format("\tHas the Timer reached %s ms difference? %s", sleep, timer.hasReached(sleep)));
        System.out.println();
        System.out.println(String.format("Timer Test finished in %s seconds.", new TimeConverter().fromMilliseconds(timer.getDifference(), TimeConverter.SECOND)));
    }
}
