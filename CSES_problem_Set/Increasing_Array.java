// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Increasing_Array {
   static BufferedReader br;
   static StringTokenizer st;
   static PrintWriter out;

   public Increasing_Array() {
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
      int size = nextInt();
      long moves = 0;
      long[] arr = new long[size];
      for(int i = 0; i < size; i++){
         arr[i] = nextLong();
      }
      for(int i = 0; i < size -1; i++){
         if(arr[i] > arr[i+1]){
            moves += arr[i] - arr[i+1];
            arr[i+1] += arr[i] - arr[i+1];
         }
      }
      out.println(moves);
   }

   static {
      br = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   }
}
