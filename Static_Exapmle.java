import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


class Test{
    private static int num = 0;
    private int person = 0;
    private String name;

    public Test(String s){
        this.name = s;
        num++;
        person++;
    }

    public static int getNum(){
        return num;
    }

    public int getPerson(){
        return this.person;
    }

    public String getName(){
        return this.name;
    }
}

public class Static_Example{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("Enter the name of a person : ");
        String s = br.readLine();
        Test t1 = new Test(s);

        bw.write(t1.getName()+" : "+t1.getPerson()+" : "+Test.getNum()+"\n");

        System.out.println("Enter the name of a person : ");
        String k = br.readLine();
        Test t2 = new Test(k);

        bw.write(t2.getName()+" : "+t2.getPerson()+" : "+Test.getNum()+"\n");
        bw.flush();
    }
}
