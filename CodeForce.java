// @ -- Ved -- @ //

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public  class CodeForce{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int c1 = Integer.parseInt(s[1]);
            int c2 = Integer.parseInt(s[2]);
            int minn = Math.min(c1, c2);
            int h = Integer.parseInt(s[3]);
            String v = br.readLine();
            int one=0, zero=0;
            for(char x: v.toCharArray()){
                if(x == '0'){
                    zero++;
                }
                else{
                    one++;
                }
            }
            long ans = 0;
            if(minn== c1){
                ans+=(h*one);
                ans+=(n*c1);
            }
            else if(minn == c2){
                ans+=(zero*h);
                ans+=(n*c2);
            }
            long result = Math.min(ans,(zero*c1+(one*c2)));
           bw.write(result+"\n");
        }
        bw.flush();
    }
}