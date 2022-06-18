class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int count=0;
        int n=a^b;
        while(n>0){
            n=n&(n-1);
             count++;   
            
        }
        return count;
    }
    
    
}
