import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
	
        int [] a = new int[15];
        while(n>0){
            for(int i=0; i<15; i++){
                if(n%2==0){
                    n=n/2;
                    a[i]=0;
                }
                else {
                    n=n/2;
                    a[i]=1;
                }   
            }
        }
        for(int i=14; i>=0; i--)
            System.out.print(a[i]);
		
    }
} 
