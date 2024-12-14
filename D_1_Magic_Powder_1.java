import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class D_1_Magic_Powder_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer  tokens = new StringTokenizer(reader.readLine());
        int n,k;
        n = Integer.parseInt(tokens.nextToken());
        k = Integer.parseInt(tokens.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];

        tokens = new StringTokenizer(reader.readLine());
        for(int i=0;i<n;i++)
            a[i] = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for(int i=0;i<n;i++)
            b[i] = Integer.parseInt(tokens.nextToken());

        int low=0,high=10000,max=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int grams = 0;
            for(int i=0;i<n;i++){
                grams += Math.max(0,a[i]*mid-b[i]);
            }
            if(grams <= k){
                low=mid+1;
                max=Math.max(max,mid);
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(max);
        reader.close();
    }  
}