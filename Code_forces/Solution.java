import java.util.Scanner;

public class Solution {
    public String reverseStr(String s, int k) {
        int len=s.length();
        char[] ch = s.toCharArray();
        int begin=0;
        int step=2*k;
        while(begin<len){
            int end=begin + k-1;
            reverse(ch,begin,end>len-1?len-1:end);
            begin += step;
        }
        return String.valueOf(ch);
    }
    public void reverse(char[] ch,int i,int j){
        while(i<j){
            swap(ch,i,j);
            i++;
            j--;
        }
        
    }

    private void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        //  "bacdfeg"
        Solution solution = new Solution();
        String reverseStr = solution.reverseStr(s, k);
        System.out.println(reverseStr);
    }
}
