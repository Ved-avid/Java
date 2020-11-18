import java.util.*;
import java.lang.*;
import java.io.*;

class Pattern{
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

        System.out.print("* ");
        printPattern(n,row,++col);
    }
}