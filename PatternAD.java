// @ -- Dev -- @ //

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

class PatternAD{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][n];
            int val = 1;
            
            for(int ad = 0; ad <= 2*(n-1); ad++){
                for(int row = 0; row < n; row++){
                    int col = ad-row;
                    if(0<=col && col < n){
                        a[row][col] = val++;
                    }
                }
            }
            
            for(int[] k : a){
                for(int b : k){
                    bw.write(b+" ");
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }
}
