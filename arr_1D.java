import java.util.Scanner;
public class arr_1D {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try (Scanner S = new Scanner(System.in)) {
            for(int i=0;i<5;i++){
                arr[i]=S.nextInt();
            }
            System.out.println("the values are ");
            for(int i=0;i<5;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
