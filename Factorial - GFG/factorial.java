//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static long factorial(int n){
        // code here
        // if(n<=1){
        //     return 1;
        // }
        // long f = factorial(n-1);
        // long res = f * n;
        // return res;
        return (n<=1)?1:factorial(n-1) * n;
        
    }
}