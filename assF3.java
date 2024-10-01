import java.io.FileReader;
import java.util.Scanner;
public class assF3 {
    public static void main(String[] args) {
        try {
            File obj1 = new File("AssF1.txt");
            Scanner file  = new Scanner("AssF1.txt");
            while(file.hasNextLine()){
                String data = file.nextLine();
                System.out.println(data);
                file.close();
            } 
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error has occured");
        }
    }
}
