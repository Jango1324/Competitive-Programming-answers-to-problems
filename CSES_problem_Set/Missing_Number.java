package Main.CSES_problem_Set;


import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Missing_Number {
   static BufferedReader br;
   static StringTokenizer st;
   static PrintWriter out;

   public Missing_Number() {
   }

   static String next() throws IOException {
      while(st == null || !st.hasMoreTokens()) {
         st = new StringTokenizer(br.readLine());
      }

      return st.nextToken();
   }

   static int nextInt() throws IOException {
      return Integer.parseInt(next());
   }

   static long nextLong() throws IOException {
      return Long.parseLong(next());
   }

   static double nextDouble() throws IOException {
      return Double.parseDouble(next());
   }

   static String nextLine() throws IOException {
      return br.readLine();
   }

   public static void main(String[] var0) throws IOException {
      solve();
      out.flush();
   }

   static void solve() throws IOException {
    int n = nextInt();
    int[] arr = new int[n-1];
    for(int i = 0; i < n-1; i++){
      arr[i] = nextInt();
    }

    int xor = 0;
     for (int num : arr) {
            xor ^= num;
        }
   
       for (int i = n; i >= 1; i--) {
            xor ^= i;
        }
        out.println(xor);

   }

   static {
      br = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   }
}
