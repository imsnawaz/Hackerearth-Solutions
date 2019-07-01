import java.util.*;
import java.lang.*;
import java.io.*;
class findProduct {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp,n = Integer.parseInt(br.readLine());
        long answer=1;
        String s=br.readLine();
        String ele[]=s.trim().split("\\s+");
        for(int i=0;i<n;i++){
            temp = Integer.parseInt(ele[i]);
            answer = (answer*temp)%(long)(Math.pow(10,9)+7);
        }
        System.out.println(answer);
    }
}