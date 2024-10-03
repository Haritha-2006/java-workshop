import java.util.Scanner;
class Bank{
    Scanner S = new Scanner(System.in);
    private int acc_no;
    private String name;
    /*void getname(){
        System.out.println("ENTER YOUR NAME :");
        String name = S.nextLine();
    }*/

    public Scanner getS() {
        return S;
    }

    public void setS(Scanner S) {
        this.S = S;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class demo3 {
    public static void main(String[] args) {
        
    }
}
