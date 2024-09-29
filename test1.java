import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String name = S.nextLine();
        float score = S.nextInt();
        S.nextLine();
        String dept = S.nextLine();
        float score1 = score/10;
        System.out.println("Name :"+name);
        System.out.println("Score1 :"+score1+"/10");
        System.out.println("Department :"+dept);
    }
}
