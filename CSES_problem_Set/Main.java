// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
   static BufferedReader br;
   static StringTokenizer st;
   static PrintWriter out;

   public Main() {
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
      
   }

   static {
      br = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   }
}
