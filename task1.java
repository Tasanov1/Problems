import java.util.*;
import java.io.*;
public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=1;
        for(int i= 1; i<=n; i++){
            sum*=i;
        }
        System.out.print(sum);
    }
}