package lesson32.exercise02;

import java.util.*;

public class Solution {

    private static final String URL = "https://samplelib.com/lib/preview/mp4/sample-15s.jpg";

    public static void main(String[] args) {
        Logger logger = new Logger(new ArrayList<>());
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            threads.add(new Thread(() -> logger.addLog("Header " + finalI, "body " + finalI)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                logger.print();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 5000);
    }
}