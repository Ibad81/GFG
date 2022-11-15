import java.util.Scanner;

public class Distinct_color {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int num=sc.nextInt();
            int []arr=new int[num];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            int max=0;
            int fir=0;
            for(int j=1;j<num;j++){
                if(arr[fir]<=arr[j]){
                    max=arr[j];
                }
                else{
                    max=arr[fir];
                }
                fir++;
            }
            System.out.println(max);
        }
    }
}
