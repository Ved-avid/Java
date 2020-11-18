import java.util.*;
import java.lang.*;
import java.io.*;

class Palindrome{
    public static void main(String[] args){
        for(int i = 0;i<args.length; i++){
            boolean f = isPalindrome(args[i]);
            if(f){
                System.out.println(args[i]+" is Palindrome");
            }
            else{
                System.out.println(args[i]+" is NOT Palindrome");
            }
        }
    }

    public static boolean isPalindrome(String s){
        int l = s.length();
        for(int i = 0, j = l-1; i<=j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}