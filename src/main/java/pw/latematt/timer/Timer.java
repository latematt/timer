package pw.latematt.timer;

/**
 * @author Matthew
 */
public class Timer {
    private long lastMS;

    public Timer() {
        reset();
    }

    public long getCurrentMS() {
        return System.nanoTime() / 1000000;
    }

    public long getLastMS() {
        return lastMS;
    }

    public void setLastMS(long currentMS) {
        lastMS = currentMS;
    }

    public long getDifference() {
        return getCurrentMS() - lastMS;
    }

    public boolean hasReached(long milliseconds) {
        return getCurrentMS() - lastMS >= milliseconds;
    }

    public void reset() {
        lastMS = getCurrentMS();
    }
}
