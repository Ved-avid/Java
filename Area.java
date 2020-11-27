import java.io.*;
import java.util.*;

class Circle{
    int r;
    public Circle(int l){
        r = l;
    }

    public void area(){
        System.out.println("Area of Circle : "+(3.14*r*r));
    }

}
class Rectangle{
    int l;
    int b;
    public Rectangle(int a, int c){
        l = a;
        b = c;
    }

    public void area(){
        System.out.println("Area of Rectangle : "+(l*b));
    }

}
class Square{
    int s;
    public Square(int l){
        s = l;
    }
    public void area(){
        System.out.println("Area of Square : "+(s*s));
    }

}


class Area{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int f = 1;
        while(f == 1){
            System.out.println("1-Area of Circle");
            System.out.println("2-Area Of Rectangle");
            System.out.println("3-Area Of Square");
            System.out.println("4-Exit");
            int t = Integer.parseInt(br.readLine());
            switch(t){
                case 1 :
                    System.out.println("Enter radius");
                    int r = Integer.parseInt(br.readLine());
                    Circle c = new Circle(r);
                    c.area();
                    break;
                case 2 :
                    System.out.println("Enter length");
                    int l = Integer.parseInt(br.readLine());
                    System.out.println("Enter Breadth");
                    int b = Integer.parseInt(br.readLine());
                    Rectangle rec = new Rectangle(l,b);    
                    rec.area();
                    break;
                case 3 :
                    System.out.println("Enter side of square: ");
                    int s = Integer.parseInt(br.readLine());
                    Square sq = new Square(s);
                    sq.area();
                    break;
                case 4 :
                    f = 2;
                    break;
                default :
                    System.out.println("Choose from the given options");
                    break;        
            }

        }
    }
}