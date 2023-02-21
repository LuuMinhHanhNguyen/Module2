package ss4_class.stop_watch;

public class StopWatchController {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int breakTime = 0;
        for (int i = 0; i < 10000000l; i++) {
            breakTime = i;
        }

        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
