import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class boilercode {
  public static void main(String[] args) throws IOException {
    BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(reader.readLine());
    for(int t = 0; t < N; t++) {
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer  tokens = new StringTokenizer(reader.readLine());
        // Add your inner loop code here
    }
    reader.close();
  }
}