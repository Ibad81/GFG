package Code_forces;
import java.util.Scanner;
public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Str_len=sc.nextInt();
        String str=sc.next();
        int A_count=0,D_count=0;
        char[] ch=str.toCharArray();
        for (int i = 0; i <Str_len; i++) {
            if(ch[i]=='A'){
                A_count++;
            }
            else if(ch[i]=='D'){
                D_count++;
            }
        }
        if(A_count>D_count){
            System.out.println("Anton");
        }
        else if(D_count>A_count){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

    }
}
