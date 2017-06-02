import java.util.*;
import java.io.*;

public class bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("pow :"+Math.pow(a,b));
        System.out.println("sqrt of a :"+Math.sqrt(a));
        System.out.println("min :"+Math.min(a,b));
        System.out.println("max :"+Math.max(a,b));
    }
}