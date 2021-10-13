package lesson6;

import lesson6.clockfeatures.Calendar;
import lesson6.clockfeatures.Stopwatch;
import lesson6.clockfeatures.TimeClock;

public class DigitalClock {

    private TimeClock timeClock;
    private Calendar calendar;
    private Stopwatch stopwatch;

    public DigitalClock(TimeClock timeClock, Calendar calendar, Stopwatch stopwatch) {
        this.timeClock = timeClock;
        this.calendar = calendar;
        this.stopwatch = stopwatch;
    }


    public DigitalClock() {
        this.timeClock = new TimeClock();
    }

    public String showTime() {
        return String.valueOf(this.getTimeClock().getHour());
    }

    public TimeClock getTimeClock() {
        return timeClock;
    }

    public void setTimeClock(TimeClock timeClock) {
        this.timeClock = timeClock;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Stopwatch getStopwatch() {
        return stopwatch;
    }

    public void setStopwatch(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }
}
