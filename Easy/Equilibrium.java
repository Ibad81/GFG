package Easy;

public class Equilibrium {
    public static void main(String[] args) {
        Equilibrium equi = new Equilibrium();
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
        System.out.println(equilibriumPoint(arr, arr_size));
    }
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(int[] arr, int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) 
           sum += a[i];

        //sum2 is used to store prefix sum.
        long sum2 = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            
            //Leaving out the value of current element from suffix sum.
            sum = sum - a[i];
            
            //Checking if suffix and prefix sums are same.
            if (sum2 == sum) {
                //returning the index or equilibrium point.
                return (i + 1);
            }
            
            //Adding the value of current element to prefix sum.
            sum2 = sum2 + a[i];
        }
        return -1;
        
    }
}