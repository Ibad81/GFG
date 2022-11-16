import java.util.Scanner;

public class codechef {
   public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int temp=sc.nextInt();
    for(int i=0;i<temp;i++){
        int nama=sc.nextInt();
        int namb=sc.nextInt();
        int sum=nama+namb;
        int m=sum/2;
        if(isPrime(sum)){
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }
}
public static boolean isPrime(int n){
    int m = n/2;
    int flag = 0;
    if(n == 0 || n == 1){
        return false;
    }
    else{
        for(int i = 2 ; i <= m ; i++){
            if(n%i == 0){
                flag = 1;
                return false;
            }
        }
    }
    return flag == 0 ? true : false;
}
}
