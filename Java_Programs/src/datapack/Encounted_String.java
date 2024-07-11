package datapack;

//You are using Java
import java.util.*;
public class Encounted_String
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     String st= sc.nextLine();
     char arr[]= st.toCharArray();
     
     int i,c=1,j,flag=0,k;
     char rep='0';
     for(i=0;i<arr.length;i++)
     {
         if(arr[i]!='<')
         {
             rep=arr[i];
            c=0;
             for(j=0;j<st.length();j++)
             {
                if(arr[i]==arr[j])
                  { 
                    c++;
                  }
             }
             System.out.print(arr[i]+""+c);
             for(k=0;k<st.length();k++)
             {
                 if(arr[k]==rep)
                 {
                     arr[k]='<';
                 }
             }
        
         }
     
     }
     
 }
}