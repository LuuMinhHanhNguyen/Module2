package ss4_class;

import java.time.LocalTime;
import java.time.ZonedDateTime;

public class StopWatch {
    private long startTime;
    private long endTime;
    StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
