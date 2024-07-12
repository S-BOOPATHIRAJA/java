package datapack;

/*Robot at the Fair



Winter is back and the end-of-season sale is all over. The city’s biggest housewares and home appliance fair is inaugurated at the Mathura Trade Centre, 
and the show hosted numerous retailers, wholesalers, and distributors to promote the domestic economy. The public participated in large groups, and the event 
coordinators designed a robot at the event ground to give instructions to the public on which directions to move.

The event ground is a rectangular grid with R rows and C columns, with R*C cells in the grid. There are many obstacles on the event ground, so the robot
 is initially set up in the cell such that it is facing north, south, east, or west. The initial position of the robot (X, Y) is known. It can take a series
  of moves through the ground. Each move is one of the following:

F - moves forward one cell in the direction that he is facing, or
L - turns 90 degrees counter-clockwise, remaining on the same cell, or
R - turns 90 degrees clockwise, remaining on the same cell.

After making these moves, the robot would stand in some final position where the guests wanted to drop. The coordinators wanted you to figure out where the
 robot is standing. You will help them by writing a program to determine the final position of the robot. You may also assume that the robot is always facing
  in a direction that is parallel to the sides of the event ground (north, south, east, or west).*/


import java.util.*;
public class Robo_Direction
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     char arr[][]= new char[a][b];
     int i,j;
     for(i=0;i<a;i++)
     {
         for(j=0;j<b;j++)
         {
             arr[i][j]=sc.next().charAt(0);
         }
     }
     int row=sc.nextInt();
     int col= sc.nextInt();
    // int mov = sc.nextInt();
     char dir=sc.next().charAt(0);
     if(dir!='F')
     {
         System.out.print(row+" "+col);
     }
     else
     {
       for(i=0;i<a;i++)
       {
           for(j=0;j<b;j++)
           {
               if(row==i&&col==j)
               {
                   if((i>0)&&arr[i-1][j]!='X')
                   {
                       System.out.println((i-1)+" "+j);
                      // System.out.println(i+" "+j);
                      
                   }
                   if((j>0)&&arr[i][j-1]!='X')
                   {
                       System.out.println(i+" "+(j-1));
                       //break;
                   }
                   if((j<b-1)&&arr[i][j+1]!='X')
                   {
                       System.out.println(i+" "+(j+1));
                   }
                   if((i<a)&&arr[i+1][j]!='X')
                   {
                       System.out.println((i+1)+" "+(j));
                   }
                   
               }
               
              
           }
           
       }
     }
     /*Sample input
      3 4 
      . . X .
      . . . . 
      X . . .
      0 0
      F*/
     
     
 }
}