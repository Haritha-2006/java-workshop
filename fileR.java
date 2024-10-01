import java.util.Scanner;
public class fileR {
    public static void main(String[] args) {
        try {
            File obj = new File("File2.txt");
            Scanner Reader = new Scanner("File1.txt");
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
                Reader.close();
            }  
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occured");
        }
    }
    
}
