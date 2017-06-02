import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        int average;
        int max = -9999;
        int min = 9999;
        int [] a = new int[n];
        for(int i= 0; i<n; i++){
            a[i]=in.nextInt();
        }
        for(int i= 0; i<n; i++){
            sum+=a[i];
        }
        average = sum / 2;
        System.out.println("average"+":"+average);
        System.out.println("sum"+":"+sum);
        for(int i= 0; i<n; i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("min"+":"+min);
        System.out.println("max"+":"+max);
    }
}