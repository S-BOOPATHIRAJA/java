package datapack;
import java.util.*;
public class SumArray
/*Given two numbers represented by two arrays,
 write a function that returns sum array. The sum array is an array 
 representation of addition of two input arrays.*/

	/*Sample Input
	            4 3
                1 3 5 6
                  1 5 8      //like a normal Addition
 Sample output: 1 5 1 4 */
	
	
	{
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int arr1[]= new int[a];
	        int arr2[]= new int[b];
	        
	        int i,count=0,j=0,c=0,sum1=0;
	        int num,k,sum=0;
	        
	        for(i=0;i<a;i++)
	        {
	            arr1[i]=sc.nextInt();
	        }
	        
	        for(i=0;i<b;i++)
	        {
	            arr2[i]=sc.nextInt();
	        }
	        
	        if(a!=b)
	        {
	        if(a>b)
	        {
	           int mod[]= new int[a];
	           num=a-b;
	           for(i=0;i<num;i++)
	           {
	               mod[i]=0;
	               count++;
	           }
	           //System.out.println(count);
	           for(i=count;i<a;i++)
	           {
	              
	               mod[i]=arr2[j];
	               j++;
	               
	           }
	          
	           int fin[]= new int[a];
	         k=a-1;  
	       int add=0,dig=0;
	       for(i=a-1;i>=0;i--)
	       {
	           c=0;
	          sum=arr1[i]+mod[k]+add; 
	          sum1=sum;
              if(i==0)
              {
                  fin[i]=sum;
                  break;
              }
	          while(sum!=0)
	          {  c++;
	             if(c!=2)
	             {
	              dig=sum%10;
	              fin[i]=dig;
	              sum=sum/10;
	             }
	             else
	             {
	                 break;
	             }
	          }
	          if(c!=1)
	          {
	              c=0;
	              while(sum1!=0)
	              {
	                  add=0;
	                  c++;
	                  if(c!=2)
	                  {
	                  dig=sum1%10;
	                  sum1=sum1/10;
	                  }
	                  else
	                  {
	                      add=sum1;
	                      break;
	                  }
	                  
	              }
	          }
	          else
	          {
	        	  add=0;
	          }
	          k--;
	       }
	       int arr[]= new int[2];
           int ar=fin[0];
           int ar1=fin[0];
           int count1=0;
           i=0;
           while(ar!=0)
           {count1++;
           	dig=ar%10;
           	
           	ar=ar/10;
           }
           if(count1==2)
           {
           	while(ar1!=0)
           	{
           		dig=ar1%10;
           		arr[i]=dig;
           		ar1=ar1/10;
           		i++;
           	}
           
           for(i=1;i>=0;i--)
           {
           	System.out.print(arr[i]+" ");
           }
           for(i=1;i<a;i++)
	        {
	            System.out.print(fin[i]+" ");
	        }
           }
           else
           {
           	 for(i=0;i<a;i++)
		        {
		            System.out.print(fin[i]+" ");
		        }
           }
	       
	        }
	        else
	        {
	            int mod[]= new int[b];
	            num=b-a;
	            for(i=0;i<num;i++)
	            {
	                mod[i]=0;
	                count++;
	            }
	            for(i=count;i<b;i++)
	            {
	                mod[i]=arr1[j];
	                j++;
	            }
	            int fin[]= new int[b];
	            k=b-1;
	            int add=0,dig=0;
	            for(i=b-1;i>=0;i--)
	            {
	                c=0;
	                sum=arr2[i]+mod[k]+add;
	                sum1=sum;
	                if(i==0)
	                {
	                    fin[i]=sum;
	                    break;
	                }
	                while(sum!=0)
	                {
	                    c++;
	                    if(c!=2)
	                    {
	                        dig=sum%10;
	                        fin[i]=dig;
	                        sum=sum/10;
	                    }
	                    else
	                    {
	                        break;
	                    }
	                }
	                if(c!=1)
	                {
	                    c=0;
	                    while(sum1!=0)
	                    {
	                        add=0;
	                        c++;
	                        if(c!=2)
	                        {
	                            dig=sum1%10;
	                            sum1=sum1/10;
	                        }
	                        else
	                        {
	                            add=sum1;
	                            break;
	                        }
	                    }
	                }
	                else
	  	          {
	  	        	  add=0;
	  	          }
	                k--;
	            }
	            int arr[]= new int[2];
	            int ar=fin[0];
	            int ar1=fin[0];
	            int count1=0;
	            i=0;
	            while(ar!=0)
	            {count1++;
	            	dig=ar%10;
	            	
	            	ar=ar/10;
	            }
	            if(count1==2)
	            {
	            	while(ar1!=0)
	            	{
	            		dig=ar1%10;
	            		arr[i]=dig;
	            		ar1=ar1/10;
	            		i++;
	            	}
	            
	            for(i=1;i>=0;i--)
	            {
	            	System.out.print(arr[i]+" ");
	            }
	            for(i=1;i<b;i++)
		        {
		            System.out.print(fin[i]+" ");
		        }
	            }
	            else
	            {
	            	 for(i=0;i<b;i++)
	 		        {
	 		            System.out.print(fin[i]+" ");
	 		        }
	            }
	        }
	        }
	        else
	        {
	            int fin[]= new int[a];
	            int add=0,dig=0;
	            for(i=a-1;i>=0;i--)
	            {
	                c=0;
	                sum=arr1[i]+arr2[i]+add;
	                sum1=sum;
	                if(i==0)
	                {
	                    fin[i]=sum;
	                    break;
	                }
	                while(sum!=0)
	                {
	                    c++;
	                    if(c!=2)
	                    {
	                        dig=sum%10;
	                        fin[i]=dig;
	                        sum=sum/10;
	                    }
	                    else
	                    {
	                        break;
	                    }
	                }
	                if(c!=1)
	                {
	                    c=0;
	                    while(sum1!=0)
	                    {
	                        add=0;
	                        c++;
	                        if(c!=2)
	                        {
	                            dig=sum1%10;
	                            sum1=sum1/10;
	                        }
	                        else
	                        {
	                            add=sum1;
	                            break;
	                        }
	                    }
	                }
	                else
	  	          {
	  	        	  add=0;
	  	          }
	            }
	            int arr[]= new int[2];
	            int ar=fin[0];
	            int ar1=fin[0];
	            int count1=0;
	            i=0;
	            while(ar!=0)
	            {count1++;
	            	dig=ar%10;
	            	
	            	ar=ar/10;
	            }
	            if(count1==2)
	            {
	            	while(ar1!=0)
	            	{
	            		dig=ar1%10;
	            		arr[i]=dig;
	            		ar1=ar1/10;
	            		i++;
	            	}
	            
	            for(i=1;i>=0;i--)
	            {
	            	System.out.print(arr[i]+" ");
	            }
	            for(i=1;i<a;i++)
		        {
		            System.out.print(fin[i]+" ");
		        }
	            }
	            else
	            {
	            	 for(i=0;i<a;i++)
	 		        {
	 		            System.out.print(fin[i]+" ");
	 		        }
	            }
	            
	        }
	    
	        
	        
	    }
	}

