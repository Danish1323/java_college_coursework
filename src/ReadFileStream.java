import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileStream{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("student.txt");
            int data;

            while((data = fis.read()) != -1){
                System.out.print((char) data);

            }
            fis.close();
        }catch (IOException e){
            System.out.println("Error while reading file");
        }
    }
}