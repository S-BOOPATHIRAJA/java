import java.util.*;
public class anagram
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    char arr[]=a.toCharArray();
    char arr2[]= b.toCharArray();
    int i,j,k,flag=0,c=0,h=0;
    for(i=0;i<b.length();i++)
    {
      c=0;
      h=0;
      for(j=0;j<a.length();j++)
      {
        if(arr2[i]==arr[j])
        {
          c++;
        }
      
      }
        
        for(k=0;k<b.length();k++)
        {
          if(arr2[k]==arr2[i])
          {
            h++;
          }
        }
        if(c!=h)
        {
          flag=1;
          break;
        }
    }
    if(flag==0)
    System.out.print("PRESENT");
    else
    System.out.print("NOT PRESENT");
      
     
    }
  }
