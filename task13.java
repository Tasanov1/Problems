import java.util.*;
import java.io.*;

public class bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.print(reverse(a));
        
    }
    public static String reverse(String str) {
        char ch[] = str.toCharArray();
        char ch2[] = new char[ch.length];
        int j = 0;
        for (int i = ch.length-1;i>=0;i--) {
            ch2[j] = ch[i];
            j++;
        }
        String str2 = new String(ch2);
        return str2;
    }
}