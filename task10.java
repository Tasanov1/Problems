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
        //сортируем
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int first = 0;
        int last = n-1;
        int position = (first+last)/2;
        while ((a[position]!=key) && (first<=last)){
            if(a[position]>key){
                last = position-1;
            }
            else 
                first = position+1;
            position = (first+last)/2;
        }
        if(first<=last){
            System.out.print("index"+"-"+ position);
        }
        else 
            System.out.print("not found");
    }
}
