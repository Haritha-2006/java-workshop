import java.util.Scanner;
class pro1{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter no. of marks :");
        int n = S.nextInt();
        int[] marks = new int[n];
        System.out.print("Enter your "+n+" subject marks :");
        for(int i=0;i<n;i++){
            marks[i]= S.nextInt();
            sum=sum+marks[i];
        }
        System.out.println("Total of "+n+" subject marks is :"+sum);
        int avg = sum /n;
        System.out.println("Average is :"+avg);

    }
}