import java.util.Scanner;

public class codeforces20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int term=sc.nextInt();
		for(int i=0;i<term;i++){
            int ans=0;
		    int n=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int count=0;
            while(n!=0){
                if(n%2==0){
                    count ++;
                }
                n=n/2;
            }
            // System.out.println(count);
            
		    for(int j=0;j<count;j++){
		        ans=ans+a+b;
		    }
		    System.out.println(ans-b);
            
		}

        
    }
}
