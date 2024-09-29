import java.util.Scanner;
class userip{
    public static void main(String args[]){
        Scanner A = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name=A.nextLine();
        System.out.print("Enter your age :");
        int age = A.nextInt();
        System.out.println("Name :"+name);
        System.out.print("Age :"+age); 
    }
}