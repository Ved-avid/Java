class Complex{
    float real;
    float imaginary;
    
    public Complex(){
        real = 0;
        imaginary = 0;
    }
    
    public Complex(float r, float i){
        real = r;
        imaginary = i;
    }
    
    public Complex(Complex o){
        this.real = o.real+1;
        this.imaginary = o.imaginary+2;
    }
    
    public Complex add(Complex o, Complex c){
        Complex ans = new Complex();
        ans.real = o.real+c.real;
        ans.imaginary = o.imaginary+c.imaginary;
        return ans;
    }
    
    public Complex subtract(Complex o, Complex c){
        Complex ans = new Complex();
        ans.real = (o.real-c.real);
        ans.imaginary = o.imaginary-c.imaginary;
        return ans;
    }
    
    public Complex multiply(Complex o, Complex c){
        Complex ans = new Complex();
        ans.real = (o.real*c.real)-(o.imaginary*c.imaginary);
        ans.imaginary = (o.real*c.imaginary)+(o.imaginary*c.real);
        return ans;
    }
    public static void display(Complex ans){
        System.out.println("--------------------------------------------------------");
        System.out.println("Real Part - >"+ans.real+" imaginary part - >"+ans.imaginary);
        System.out.println("--------------------------------------------------------");
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class ComplexMain{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;
        do{
             System.out.println("--- Choose among the below ---");
             System.out.println("1 - Operate on default Complex and user input Complex ");
             System.out.println("2 - Operate on user input Complex numbers :");
             System.out.println("3 - Operate on user input Complex Number and object Constructor : ");
             System.out.println("4 - Stop");
             n = br.readLine();
            if(n.equals("1")){
                System.out.println("Enter the Real Part : ");
                float real = Float.parseFloat(br.readLine());
                System.out.println("Enter the imaginary part : ");
                float ima = Float.parseFloat(br.readLine());
                Complex c = new Complex(real, ima);
                Complex o = new Complex();
                System.out.println("--- Choose among the below ---");
                System.out.println("1-Addition");
                System.out.println("2-Subtraction");
                System.out.println("3-Multiplication");
                String k = br.readLine();
                if(k.equals("1")){
                    Addition(c,o);
                }
                else if(k.equals("2")){
                   Subtraction(c,o);
                }
                else if(k.equals("3")){
                   Multiply(c,o);
                }
            }
            else if(n.equals("2")){
                System.out.println("Enter the Real Part : ");
                float real = Float.parseFloat(br.readLine());
                System.out.println("Enter the imaginary part : ");
                float ima = Float.parseFloat(br.readLine());
                Complex c = new Complex(real, ima);
                System.out.println("Enter real part : ");
                float r = Float.parseFloat(br.readLine());
                System.out.println("Enter imaginary part :");
                float i = Float.parseFloat(br.readLine());
                Complex o = new Complex(r,i);
                System.out.println("--- Choose among the below ---");
                System.out.println("1-Addition");
                System.out.println("2-Subtraction");
                System.out.println("3-Multiplication");
                String k = br.readLine();
                if(k.equals("1")){
                    Addition(c,o);
                }
                else if(k.equals("2")){
                    Subtraction(c,o);
                }
                else if(k.equals("3")){
                    Multiply(c,o);
                }
            }
             else if(n.equals("3")){
                System.out.println("Enter the Real Part : ");
                float real = Float.parseFloat(br.readLine());
                System.out.println("Enter the imaginary part : ");
                float ima = Float.parseFloat(br.readLine());
                Complex c = new Complex(real, ima);
                Complex o = new Complex(c);
                System.out.println("--- Choose among the below ---");
                System.out.println("1-Addition");
                System.out.println("2-Subtraction");
                System.out.println("3-Multiplication");
                String k = br.readLine();
                if(k.equals("1")){
                    Addition(c,o);
                }
                else if(k.equals("2")){
                    Subtraction(c,o);
                }
                else if(k.equals("3")){
                    Multiply(c,o);
                }
            }
            
        }while(!n.equals("4"));
    }
     public static void Addition(Complex c, Complex o){
            Complex ans = new Complex();
            ans = ans.add(c,o);
            System.out.println("After addition : ");
            Complex.display(ans);
        }
        public static void Subtraction(Complex c, Complex o){
            Complex ans = new Complex();
            ans = ans.subtract(c,o);
            System.out.println("After subtraction : ");
            Complex.display(ans);
        }
         public static void Multiply(Complex c, Complex o){
            Complex ans = new Complex();
            ans = ans.multiply(c,o);
            System.out.println("After multiplication : ");
            Complex.display(ans);
    }
}
