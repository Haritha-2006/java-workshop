import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("Enter :");
        String RBC = S.nextLine();
    
        if(RBC.equals("win")){
            System.out.println("RCB wins");
        }
        else{
            System.out.println("RCB lose");
        }
    }
}
