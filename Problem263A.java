
import java.util.*;
import java.io.*;

public class Problem263A {

    // ---- Fast input reader (use this instead of Scanner if you need speed) ----
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
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

    // ---- Output ----
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        // Simple Scanner option (easier, slightly slower) — uncomment if you prefer it:
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        solve();

        out.flush(); // always flush before the program ends, or buffered output won't print
    }

    // ---- Put your actual problem-solving logic here ----
    static void solve() throws IOException {
        int i = 3;
        int j = 3;
        int row1 = 0;
        int column1 = 0;
        for(int i1 = 1; i<=5; i1++){
            String s = nextLine().replace(" ", "");
            if(s.contains("1")){
                row1 = i1;
                column1 = s.indexOf("1")+1;
                break;
            }
        }
        out.println(Math.abs(j-row1) + Math.abs(i-column1));

        
    
    }
}