package lesson31.exercise01;

/*
Скачивание из сети файла с использованием потока
 */

import java.util.Date;

public class Solution {

    private static final String URL = "https://samplelib.com/lib/preview/mp4/sample-15s.jpg";

    public static void main(String[] args) {
        System.out.println("starting at " + new Date());
        Thread downloadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new DownloadFile(URL, "someFile.jpg").start(2);

            }
        });
        System.out.println("finishing at " + new Date());
    }
}