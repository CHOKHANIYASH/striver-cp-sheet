import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class B_Pipeline {
  public static void main(String[] args) throws IOException {
    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer  tokens = new StringTokenizer(reader.readLine());
    long n;
    long k;
    n = Long.parseLong(tokens.nextToken());
    k = Long.parseLong(tokens.nextToken());
    long maxPipes = ((long)(k-1)*(k-1+1))/2;
    n--;
    if(maxPipes < n)
      System.out.println(-1);
    else{
      long low=0,high=k-1,max=0;
      while(low<=high){
        long mid = low + (high-low)/2;
        long sum = maxPipes - ((mid)*(mid+1))/2;
        if(sum>=n){
          low = mid+1;
          max = mid;
        }
        else  
          high= mid-1;
      }
      System.out.println(k-1-max);
    }
    reader.close();
  }
}