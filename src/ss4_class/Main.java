package ss4_class;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1.0, 2, 3);

        quadraticEquation.getRoot1();
        quadraticEquation.getRoot2();


        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(LocalDateTime.now());
        stopWatch.end();
        System.out.println(LocalDateTime.now());
        System.out.println(stopWatch.getElapsedTime());
    }

}
