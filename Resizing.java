import java.io.*;
import java.util.*;
import java.lang.*;

class Resizing{
    public static Scanner sc = new Scanner(System.in);
    public static int[] base = new int[10];
    public static void main(String[] args){
        input();
        print();
        resize();
        input();
        print();

    }

    public static void input(){
        for(int i = 0;i<base.length;i++){
            base[i] = sc.nextInt();
        }
    }

    public static void print(){
        for(int i = 0;i<base.length;i++){
            System.out.print(base[i]+" ");
        }
        System.out.println();
    }

    public static void resize(){
        int[] original = base;
        base = new int[12];
        for(int i = 0;i<original.length;i++){
            base[i]=original[i];
        }
    }

}