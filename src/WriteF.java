import java.io.FileOutputStream;
import java.io.IOException;

public class WriteF {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            String data = "Hello, this is a sample text to write into the file.";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}