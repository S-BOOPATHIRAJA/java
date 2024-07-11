package datapack;
import java.util.*;

public class Butterfly_Pattern// You are using Java


{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i,j,spc;
        int n=(a*2);
        int k=-2;
        for(i=0;i<a;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            n=n-2;
            for(spc=0;spc<n;spc++)
            {
                System.out.print("  ");
            }
          
            for(j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            
            System.out.println();
        }
       for(i=a;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("*"+" ");
            }
            k=k+2;
            for(spc=k;spc>=1;spc--)
            {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}