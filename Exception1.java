/* -- Ved -- */
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.ArithmeticException;
import java.util.NoSuchElementException;
public class Exception1 {
    static public void main(String[] args){
        try{
            int ans = divide();
            out.println("Quotient is -> "+ans);
        }
        catch(ArithmeticException e){
            out.println(e.toString());
            out.println("Unable to Perform division, Shutting down");
        }

    }

    static public int divide(){
        try {
            int x = getInt();
            int y = getInt();
            out.println("First Number - >" + x + " Second Number - > " + y);
            int z = x / y;
            return z;
        }catch(NoSuchElementException e){
            throw new ArithmeticException("No Suitable input");
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Tried To divide by Zero");
        }
    }
    static public int getInt(){
        Scanner sc = new Scanner(System.in);
        out.println("Enter a Number - ");
        while(true) {
            try {
                 return sc.nextInt();
            } catch (InputMismatchException e){
                    sc.nextLine();
                    out.println("Please Enter a Integer Value");
            }
        }
    }
}
