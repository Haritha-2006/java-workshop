import java.util.Scanner;
public class arr_2D {
    public static void main(String[] args) {
        int i,j;
        Scanner S = new Scanner(System.in);
        //int a[][] = {{5,4,6,},{1,2,3},{8,9,6}};
        System.out.print("Enter no. of element :");
        int n = S.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter elements :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                a[i][j]=S.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
