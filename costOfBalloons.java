import java.io.*;
import java.lang.*;
class costOfBalloons {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int t_i=0;t_i<t;t_i++){
            String cob=br.readLine();
            String c[]=cob.trim().split("\\s+");
            int g=Integer.parseInt(c[0]);
            int p=Integer.parseInt(c[1]);
            int n = Integer.parseInt(br.readLine());
            int a=0,b=0;
            for(int i=0;i<n;i++){
                String vals=br.readLine();
                String val[]=vals.trim().split("\\s+");
                if(Integer.parseInt(val[0])==1)
                    a++;
                if(Integer.parseInt(val[1])==1)
                    b++;
            }
            System.out.println(Math.min(b,a)*Math.max(g,p)+Math.max(b,a)*Math.min(g,p));
        }
 
    }
}