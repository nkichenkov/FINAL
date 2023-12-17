package lesson32.exercise02;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

public class DownloadFile extends Thread {

    private final String url;
    private final String fileName;
    private final int id;

    public DownloadFile(String url, String fileName, int id) {
        this.url = url;
        this.fileName = fileName;
        this.id = id;
    }

    @Override
    public synchronized void start() { //Все объекты класса будут синхронизироваться. Значит что пока один поток
        // не завершил своб работу, другой такой же не может быть начат
        super.start();
        System.out.println(new Date() + "starting " + id);
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println(new Date() + "finished " + id);
        } catch (IOException e) {
            System.out.println(new Date() + "failed " + id);
        }
    }
}
