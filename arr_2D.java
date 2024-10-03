public class arr_2D {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int i,j;
        a[][] = {{5,4,6,},{1,2,3},{8,9,6}};
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
