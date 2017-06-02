import java.io.*;
import java.util.*;

public class bonus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean[] yesno = new boolean[100];
        String a = in.next();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++)
        {
            int n=0;
            if(yesno[i]==false)
            {
                for(int j=0;j<a.length();j++)
                {
                    if(a.charAt(i)==a.charAt(j))
                    {
                        n++;
                        yesno[j]=true;
                    }
                }
                yesno[i]=false;
            }
            if(yesno[i]==false && n>1)
            {
                System.out.println(a.charAt(i)+"-"+n);
            }
            
        }
    }
}
