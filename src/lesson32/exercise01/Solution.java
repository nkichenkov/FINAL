package lesson32.exercise01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {

    private static final String URL = "https://samplelib.com/lib/preview/mp4/sample-15s.jpg";

    public static void main(String[] args) {
        System.out.println("starting thread " + new Date());
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(new DownloadFile(URL, "someFile.jpg", i)));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        System.out.println("finishing thread " + new Date());
    }
}