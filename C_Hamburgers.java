
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class C_Hamburgers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    int[] n = new int[3];
    int[] p = new int[3];
    StringTokenizer token = new StringTokenizer(reader.readLine());
    for(int i=0;i<3;i++)
      n[i] = Integer.parseInt(token.nextToken());
    token = new StringTokenizer(reader.readLine());
    for(int i=0;i<3;i++)
      p[i] = Integer.parseInt(token.nextToken());
    Long k = Long.parseLong(reader.readLine());
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    long low=0,high = (long) 1e13,max=0;
    while(low<=high){
      long mid = low + (high-low)/2;
      long cost = Math.max(0, map.getOrDefault('B', 0) * mid - n[0]) * p[0]
                + Math.max(0, map.getOrDefault('S', 0) * mid - n[1]) * p[1]
                + Math.max(0, map.getOrDefault('C', 0) * mid - n[2]) * p[2];
      if(cost==k){
        max = mid;
        break;
      }
      else if(cost>k)
        high = mid-1;
      else{
        low=mid+1;
        max = Math.max(max,mid);
      }
    }
    System.out.println(max);
    reader.close();
  }
}