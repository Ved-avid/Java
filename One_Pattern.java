import java.lang.*;
import java.io.*;
import java.util.*;

class One_Pattern{
    static public void main(String[] args){
        int n = Integer.parseInt(args[0]);
        printPattern(n,1,1);
    }

    static private void printPattern(int n, int row, int col){
        if(row>n){
            return;
        }
        if(col>row){
            System.out.println();
            printPattern(n,++row,1);
            return;
        }
        if((col&1)==0){
            System.out.print("0 ");
        }
        if((col&1)!=0){
            System.out.print("1 ");
        }
        printPattern(n,row,++col);
    }
}