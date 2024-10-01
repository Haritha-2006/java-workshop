import java.io.File;
public class assF1 {
    public static void main(String[] args) {
        try {
            File assF = new File("AssF1.txt");
            if(assF.createNewFile()){
                System.out.println("FIle created successfully");
            }
            else{
                System.out.println("File already exists");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            System.out.println("An error has occured");
        }
    }
}
