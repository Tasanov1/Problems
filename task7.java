import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0)
            System.out.print("Year Is Leap Year.");
        else 
            System.out.print("Year Is not Leap Year");
    }
}