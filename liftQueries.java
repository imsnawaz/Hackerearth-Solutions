import java.util.*;
import java.io.*;
import java.lang.*;
class liftQueries {
    public static void main(String args[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int l1=0,l2=7;
        StringBuffer sb = new StringBuffer();
        for(int t_i =0;t_i<t;t_i++){
            int f = Integer.parseInt(br.readLine());
            if(Math.abs(l1-f)<=Math.abs(l2-f)){
                sb.append("A\n");
                l1=f;
            }
            else{
                sb.append("B\n");
                l2=f;
            }
        }
        System.out.println(sb);
    }
}