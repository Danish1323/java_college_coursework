import java.io.File;
import java.io.IOException;

public class FileDemo{
    public static void main(String[] args){
        try{
            File file = new File ("student.txt");

            if(file.createNewFile()){
                System.out.println("File Created succesfully");
            }else {
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An errro occured");
        }
    }
}