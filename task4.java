import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for(int i= 0; i<n; i++){
            a[i]=in.nextInt();
        }
        for(int i= 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i= 0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}