import java.util.*;
import java.io.*;
import java.lang.*;
class Complex{
    int real;
    int imaginary;

    public Complex(){
        real = 0;
        imaginary = 0;
    }

    public Complex(int r, int i){
        real = r;
        imaginary = i;
    }

    public Complex(Complex c1){
        real = c1.real+5;
        imaginary = c1.imaginary+10;
    }


    public Complex add(Complex c, Complex b){
        Complex base = new Complex();
        base.real = c.real+b.real;
        base.imaginary = c.imaginary+b.imaginary;
        return base;
    }

    public Complex subtract(Complex c, Complex b){
        Complex base = new Complex();
        base.real = Math.abs(c.real-b.real);
        base.imaginary = Math.abs(c.imaginary-b.imaginary);
        return base;
    }

    public Complex multiply(Complex c, Complex b){
        Complex base = new Complex();
        base.real = c.real*b.real-c.imaginary*b.imaginary;
        base.imaginary = c.imaginary*b.real+c.real*b.imaginary;
        return base;
    }
    public void printComplex(Complex c){
        System.out.println("Real part --> "+c.real+" imaginary part -- >"+c.imaginary);
    }

}

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the real part");
        int r = Integer.parseInt(br.readLine());
        System.out.println("Enter the imaginary part");
        int i = Integer.parseInt(br.readLine());

        Complex c = new Complex(r,i);
        Complex b = new Complex(c);
        Complex ans = c.add(c,b);
        c.printComplex(ans);

        Complex sub = c.subtract(c,b);
        c.printComplex(sub);

    }
}








