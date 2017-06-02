import java.util.*;
import java.io.*;
public class bonus{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double kek;
        double summa=0;
        System.out.print("0.");
        for(int i=-1; i>=-15; i--){
            kek = Math.pow(2,i);
            if(n>=kek){
            n=n-kek;
            System.out.print("1");
            }
            else if(n<kek)
            System.out.print("0");
            if(n==0)
            break;
        }
    }
}
