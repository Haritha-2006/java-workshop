import java.io.File;
import java.util.Scanner;
public class assF3 {
    public static void main(String[] args) {
        try {
            File obj1 = new File("AssF1.txt");
            Scanner file  = new Scanner(obj1);
            while(file.hasNextLine()){
                String data = file.nextLine();
                System.out.println(data);
                
            } 
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error has occured");
        }
    }
}
