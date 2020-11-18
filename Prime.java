// @ -- Dev -- @ //

import java.io.*;
import java.lang.*;
import java.util.*;

class Prime{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] a = br.readLine().split(" ");
            int l = Integer.parseInt(a[0]);
            int u = Integer.parseInt(a[1]);
            
            for(int i = l;i<=u;i++){
                if(i!=0 &&  i!=1 && isPrime(i)){
                    bw.write(i+"\n");
                }
            }
        }
        bw.flush();
    }
    static boolean isPrime(int x){
        boolean f = true;
        for(int i = 2;i*i<=x;i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
}
