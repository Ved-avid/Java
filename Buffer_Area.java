import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Shape{
    int l;
    int b;

    Shape(int l){
        this.l = l;
        this.b = 0;
    }

    Shape(int l, int b){
        this.l = l;
        this.b = b;
    }
}

class Rectangle extends Shape{
    Rectangle(int l, int b){
        super(l,b);
    }
    public void area(){
        System.out.println("Area of rectabgle : "+(this.l*this.b));
    }
}

class Circle extends Shape{
    Circle(int l){
        super(l);
    }

    public void area(){
        System.out.println("Area of Circle : "+((float)3.14*this.l*this.l));
    }
}

class Square extends Shape{
    Square(int l){
        super(l);
    }

    public void area(){
        System.out.println("Area of Square :"+(this.l*this.l));
    }
}
class Buffer_Area{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do{
            System.out.println("1-for circle");
            System.out.println("2-for rectangle");
            System.out.println("3-for square");
            System.out.println("4- stop");

            System.out.println("---------------------");
            System.out.println("Enter your choice");
            n = Integer.parseInt(br.readLine());
            if(n==1){
                System.out.println("Enter the radius of circle");
                int d = Integer.parseInt(br.readLine());
                Circle c = new Circle(d);
                c.area();
            }
            else if(n==2){
                System.out.println("Enter length");
                int l = Integer.parseInt(br.readLine());
                System.out.println("Enter breadth");
                int b = Integer.parseInt(br.readLine());
                Rectangle r = new Rectangle(l,b);
                r.area();
            }
            else if(n==3){
                System.out.println("Enter side of Square");
                int s = Integer.parseInt(br.readLine());
                Square sq = new Square(s);
                sq.area();
            }
        }while(n!=4);
    }
}
































