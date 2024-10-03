import java.io.File;
import java.util.Scanner;
public class fileR {
    public static void main(String[] args) {
        try {
            File obj = new File("File2.txt");
            Scanner Reader = new Scanner(obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
                
            }  
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occured");
        }
    }
    
}
