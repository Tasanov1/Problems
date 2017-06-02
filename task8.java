import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i>j)
                    System.out.print(i+" "); 
            }
            System.out.println(" ");
        }
    }
}
