import java.lang.*;
import java.util.*;
import java.io.*;

class Volume{    
    public static String shape ;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do{
            System.out.println("To find volume Enter - 1");
            System.out.println("To exit enter - 2");
            n = Integer.parseInt(br.readLine());
            if(n == 1){
                System.out.println("choose among cube, cuboid, ellipsoid");
                shape = br.readLine();
                if(shape.equalsIgnoreCase("cube")){
                    Volume cube = new Volume();
                    System.out.println("Enter the side of the cube: ");
                    int side = Integer.parseInt(br.readLine());
                    cube.volume(side);
                }
                else{
                    Volume c = new Volume();
                    c.volume();
                    
                }
            }
        }while(n!=2);

    }

    public void volume(int s){
        System.out.println("Volume if cube is : " +(s*s*s));
    }

    public void volume() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(shape.equalsIgnoreCase("cuboid")){
            System.out.println("Enter the length of cuboid: ");
            int l = Integer.parseInt(br.readLine());
            System.out.println("Enter the breadth of cuboid: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println("Enter the height of cuboid: ");
            int h = Integer.parseInt(br.readLine());
            System.out.println("Volume of cuboid is :"+(l*b*h));
        }
        else if(shape.equalsIgnoreCase("ellipsoid")){
            System.out.println("Enter x axis :");
            int l = Integer.parseInt(br.readLine());
            System.out.println("Enter y axis :");
            int h = Integer.parseInt(br.readLine());
            System.out.println("Enter z axis :");
            int b = Integer.parseInt(br.readLine());
            int ans = (4*l*b*h)/3;
            System.out.println("Volume of ellipsoid is :"+ans);
        }
        else{
            System.out.println("Please choose between cuboid or ellipsoid");
        }
    }
}