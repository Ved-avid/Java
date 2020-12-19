import java.io.*;

class Employee{
    String name;
    String  employee_id;
    String adress;
    String phone;
    public final double da = 0.1;
    public final double hra = 0.2;

    public Employee(String n, String id, String ad, String ph){
        name=n;
        employee_id=id;
        adress=ad;
        phone=ph;
    }

    public void getSalary(int salary){

        double ans = salary+(salary*da)+(salary*hra);
        System.out.println("Salary is --> "+ans);
        System.out.println("---------------------------------------------------------------------");

    }

    public String toString(){
        String className = this.getClass().getName();
        String[] parent = getClass().getSuperclass().toString().split(" ");
        System.out.println("---------------------------------------------------------------------");
        return "name - >"+name+" ,\n"+
               "works in "+parent[1]+" department ,\n"+
               "under the "+className+" section , \n"+
               "Employee ID - >"+employee_id+" ,\n"+
               "Mobile No. ->"+phone+" ,";
    }
}
class Teaching extends Employee{
    String designation;
    String specialization;

    public Teaching(String n, String id, String ad, String ph,String designation,String specialization) {
        super(n,id,ad,ph);
        this.designation = designation;
        this.specialization = specialization;
    }
}
class Faculty extends Teaching{
   int salary; 
   public  Faculty(String n, String id, String ad, String ph,String designation,String specialization,int salary){
       super(n,id,ad,ph,designation,specialization);
       this.salary=salary;
   }
}

class Technical extends Teaching{
    int salary;
    public Technical(String n, String id, String ad, String ph,String designation,String specialization,int salary){
        super(n,id,ad,ph,designation,specialization);
        this.salary = salary;
    }
}
class Office extends Employee{
    String designation;

    public Office(String n, String id, String ad, String ph,String designation) {
        super(n,id,ad,ph);
        this.designation = designation;
    }
}

class Administration extends Office{
    int salary;
    public Administration(String n, String id, String ad, String ph,String designation,int salary){
        super(n,id,ad,ph,designation);
        this.salary = salary;
    }
}
class Account extends Office{
    int salary;
    public Account(String n, String id, String ad, String ph,String designation,int salary){
        super(n,id,ad,ph,designation);
        this.salary = salary;
    }
}

class Emp_Main{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ch, name="", add="", ph="", id="";
       do{
           System.out.println("Choose from below :");
           System.out.println("1 - Faculty");
           System.out.println("2 - Technical :");
           System.out.println("3 - Administration");
           System.out.println("4 - Account");
           System.out.println("5 - Stop");
           System.out.println("Enter the Option");
           ch = br.readLine();
           if(!ch.equals("5")){
           System.out.println("Enter Name : ");
           name = br.readLine();
           System.out.println("Enter Adress : ");
           add = br.readLine();
           System.out.println("Enter Phone Number :");
           ph = br.readLine();
           System.out.println("Enter Employee ID : ");
           id = br.readLine();
           }

           if(ch.equals("1")){
            System.out.println("Enter Designation : ");
            String dg = br.readLine();
            System.out.println("What is your speciality :");
            String sp = br.readLine();
            System.out.println("Enter your salary :");
            int sal = Integer.parseInt(br.readLine());
            Faculty f = new Faculty(name,id,add,ph,dg,sp,sal);
            System.out.println(f.toString());
            f.getSalary(sal);
           }
           else if(ch.equals("2")){
            System.out.println("Enter Designation : ");
            String dg = br.readLine();
            System.out.println("What is your speciality :");
            String sp = br.readLine();
            System.out.println("Enter your salary :");
            int sal = Integer.parseInt(br.readLine());
            Technical f = new Technical(name,id,add,ph,dg,sp,sal);
            System.out.println(f.toString());
            f.getSalary(sal);

           }
           else if(ch.equals("3")){
            System.out.println("Enter Designation : ");
            String dg = br.readLine();
            System.out.println("Enter your salary :");
            int sal = Integer.parseInt(br.readLine());
            Administration f = new Administration(name,id,add,ph,dg,sal);
            System.out.println(f.toString());
            f.getSalary(sal);
           }
           else if(ch.equals("4")){
            System.out.println("Enter Designation : ");
            String dg = br.readLine();
            System.out.println("Enter your salary :");
            int sal = Integer.parseInt(br.readLine());
            Account f = new Account(name,id,add,ph,dg,sal);
            System.out.println(f.toString());
            f.getSalary(sal);
           }

       }while(!(ch.equals("5")));
       
    } 

}