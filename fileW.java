import java.io.FileWriter;
public class fileW {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("File1.txt");
            writer.write("Hello World !!!");
            writer.close();
            System.out.println("Written successfully");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some error has been occured");
        }
    }
}
