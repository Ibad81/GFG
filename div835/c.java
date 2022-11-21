package div835;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nam=sc.nextInt();
        for (int indx = 0; indx < nam; indx++) {
            int len=sc.nextInt();
            int  area[]=new int[len];
            HashSet<Integer> hs = new HashSet<>();
            for(int jdx=0;jdx<area.length;jdx++){
                area[jdx]=sc.nextInt();
                hs.add(area[jdx]);
            }
            
            int a[] = new int[len];
            for(int i = 0 ; i < len ; i++){
                a[i] = area[i];
            }
            Arrays.sort(a);
            int b[] = new int[len];
            for(int i = a.length-1 , j = 0; i>= 0 ;j++, i--){
                b[j] = a[i];
            }
            
            if(hs.size() == 1){
                for(int i = 0 ; i < len ; i++){
                    System.out.print(0+" ");
                }
                System.out.println();
            }
            else{
                for(int i = 0; i  < len ; i++){
                    for(int j = 0 ; j < len ; j++){
                        if(area[i] != b[j]){
                            // System.out.println(area[i] +" "+b[j] + " ");
                            area[i] = area[i] - b[j];
                            break;
                        }
    
                    }
                    // System.out.println();
                }
                for(int j : area){
                    long num=j;
                    System.out.print(num+" ");
                }
                System.out.println();
            }
        }
    }
}
