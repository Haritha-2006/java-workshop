import java.io.File;
//import java.io.IOException;
public class fileC {
    public static void main(String[] args) {
        //File file1 = new File("File.txt");
        try{
            File obj = new File("File1.txt");
            if(obj.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
