package academy.devdojo.maratonajava.javacore.IO.test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
            System.out.println("Path " +file.getPath());
            System.out.println("Absolute path " +file.getAbsolutePath());
            System.out.println("Is directory " +file.isDirectory());
            System.out.println("Is file " +file.isFile());
            System.out.println("Is hidden " +file.isHidden());
            System.out.println("can read " +file.canRead());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("deleted" + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
