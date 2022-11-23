import java.util.Arrays;
import java.util.Scanner;

public class codechef23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int term=sc.nextInt();
		for(int i=0;i<3;i++){
		    int arr[]=new int [3];
		    for(int j=0;j<3;j++){
		        arr[j]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    
		        if(arr[0]+arr[1]<arr[2]){
		        System.out.println("Yes");
    		    }
    		    else{
    		        System.out.println("No");
    		        
    		    }
		    
		}
    }

    public int minPalPartition(int[] arr) {
        return 0;
    }
}
