import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Distinct_nei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> al=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            boolean flag=false;
            int n=sc.nextInt();
            int arr[]=new int[2*n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0,j=2*n-1;i<=j;i++,j--){
                if(!al.contains(arr[i]-arr[j]))
                    al.add(arr[i]-arr[j]);
                else if(!al.contains(arr[j]-arr[i]))
                    al.add(arr[j]-arr[i]);
                else{
                    System.out.println("NO");
                    flag=true;
                    break;
                }
            }
            Set<Integer> hs=new HashSet<>();
            for(int i:al)
                hs.add(i);
            if(hs.size()==n && flag==false)
                System.out.println("YES");
            else if(flag==false)
                System.out.println("NO");
            al.clear();
        }
    }
}
