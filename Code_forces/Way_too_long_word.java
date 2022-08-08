package Code_forces;

import java.util.Scanner;

public class Way_too_long_word {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        for(int j=0;j<n;j++){
            if(words[j].length()<=10){
                System.out.print(words[j]);
            }
            else{
                System.out.print(words[j].charAt(0));
                System.out.print(words[j].length()-2);
                System.out.print(words[j].charAt(words[j].length()-1));
                    
                
            }
            System.out.print("\n");
            
            
        }
    }
}
    