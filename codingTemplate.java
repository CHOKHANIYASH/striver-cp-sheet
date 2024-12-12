import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class codingTemplate {
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
  public static void printArray1D(int[] arr){
    int n = arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void printArray2D(int[][] arr){
    int n = arr.length;
    int m = arr[0].length;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }
  public void fillArray(int[][] arr,int val){
    int m,n;
    m = arr.length;
    n = arr[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j] = val;
        }
    }
  }
  class sortComparator implements Comparator<int[]>{
    public int compare(int[] a,int[] b){
        return a[0] - b[0];
    }
  }
  class dataStructures{
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Queue<Integer> q = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[ 10];
  }
}