import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        int key = in.nextInt();
        int ii=-1;
        boolean B = true;
        for(int i=0; i<n; i++){
            if(a[i]==key){
                ii=i;
            }
            else{
                B = false;
            }
        }
        if(ii!=-1)
            System.out.print("index"+"-"+ii);
        else 
            System.out.print("not found");
            
    }
}
