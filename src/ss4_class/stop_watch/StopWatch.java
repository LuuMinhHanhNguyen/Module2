package ss4_class.stop_watch;

import java.time.LocalTime;
import java.time.ZonedDateTime;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
        System.out.println( "Init "+ this.startTime);
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
        System.out.println("Start " + this.startTime);
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
        System.out.println("Stop " + this.endTime);
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
