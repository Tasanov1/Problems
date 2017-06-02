import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        int last = n-1;
        int [] a = new int [n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        for(int i=0; i<n; i++){
            sum += Math.pow(2,(last-i))*a[i];
        }
        System.out.print(sum);
    }
}