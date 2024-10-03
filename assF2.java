import java.io.FileWriter;
public class assF2 {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("AssF1.txt");
            obj.write("Even numbers are :\n");
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    obj.write(i+"\n");
                }
            }
            obj.close();
            System.out.println("Written successfully");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error has occured");
        }
    }
}
