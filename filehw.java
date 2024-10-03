import java.io.FileWriter;
public class filehw {
    public static void main(String[] args) {
        try {
            FileWriter author = new FileWriter("File2.txt");
            for(int i=1;i<=10;i++){
                author.write(i+"\n");
            }
            author.close();
            System.out.println("written successfully");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error has occured");
        }
    }
}
