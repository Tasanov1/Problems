import java.util.*;
import java.io.*;

public class bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=Math.random();
        double b=Math.random();
        System.out.print(Math.sqrt(-2*Math.log(a))*Math.sin(b*Math.PI));
    }
}