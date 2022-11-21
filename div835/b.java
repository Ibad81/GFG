package div835;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t=sc.nextInt();
            String jhn=sc.next();
            char[] jn=jhn.toCharArray();
            int arr[] =new int[jn.length];
            for(int j=0;j<jn.length;j++){
                char character=jn[j];
                arr[j]=(int)character;
            }
            int more = arr[0];  
            for (int m = 0; m < arr.length; m++) {  
                if(arr[m] > more)  
                more = arr[m];  


            }

            
              
            System.out.println(more-96);
        }

        System.out.println('z'-'a');
    }
}
