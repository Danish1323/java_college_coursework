import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File file = new File("student.txt");

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size in bytes: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}