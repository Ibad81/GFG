import java.util.Scanner;

public class MArio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int num=sc.nextInt();
		    String str=sc.next();
            String s1=str.substring(0,num/2);
            String s2=str.substring(num/2);
            if(s1.equals(s2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            

		}
    }
}
