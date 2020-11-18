// OverLoading changes the signature of the method while the name remains same..
import java.util.Scanner;
class Method{
    public void display(){
        System.out.println("Hi, I have no argument");
    }

    public void display(String s){
        System.out.println("Hi, I have a String argument ->"+s);
    }
    public void display(int i){
        System.out.println("Hi, I have a Integer argument -->"+i);
    }
}

class OverLoading{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("1-for no parameter");
            System.out.println("2-for String parameter");
            System.out.println("3-for integer parameter");
            System.out.println("4-To exit");
            n = sc.nextInt();
            sc.nextLine();
            if(n==1){
                Method m = new Method();
                m.display();
                System.out.println("-------------------------------");
            }
            else if(n==2){
                System.out.println("Enter any String: ");
                String c = sc.nextLine();
                Method m = new Method();
                m.display(c);
                System.out.println("-------------------------------");
            }
            else if(n==3){
                System.out.println("Enter any integer value");
                int c = sc.nextInt();
                Method m = new Method();
                m.display(c);
                System.out.println("-------------------------------");
            }
        }while(n!=4);
    }
}