package Code_forces;

import java.util.Scanner;

public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=0;
        int col=0;
        int [][] arr=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(Math.abs(2-row)+Math.abs(2-col));
    }
}
