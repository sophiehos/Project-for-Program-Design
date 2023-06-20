//Sophia Hostetler
//U27264415
//Basketball Bar Chart

import java.util.Scanner;
public class BasketballBarChart
{
public static void main (String[] args)
   {
   
   
 //Variables
int point1, point2, point3, point4, point5;
 String player1, player2, player3, player4, player5;
 
 
 
 Scanner scan = new Scanner(System.in);
 Scanner input = new Scanner(System.in);
 
 System.out.print ("Enter the first names of the 5 players: ");

 player1 = scan.next ();
 player2 = scan.next ();
 player3 = scan.next ();
 player4 = scan.next ();
 player5 = scan.next ();  
 
  

 
 System.out.print ("Enter points earned by " + player1 + ": ");
 point1 = scan.nextInt();
 while (0>= point1)
 {
   System.out.println ("Enter only positive integers");
   System.out.print ("Please re-enter points: ");
   point1 = scan.nextInt();
   

   }
 

 System.out.print ("Enter points earned by " + player2 + ": ");
 point2 = scan.nextInt();
 while (0>= point2)
 {
   System.out.println ("Enter only positive integers");
   System.out.print ("Please re-enter points: ");
   point2 = scan.nextInt();
   

   }

 System.out.print ("Enter points earned by " + player3 + ": ");
 point3 = scan.nextInt();
 while (0>= point3)
 {
   System.out.println ("Enter only positive integers");
   System.out.print ("Please re-enter points: ");
   point3 = scan.nextInt();
   

   }

 System.out.print ("Enter points earned by " + player4 + ": ");
 point4 = scan.nextInt();
 while (0>= point4)
 {
   System.out.println ("Enter only positive integers");
   System.out.print ("Please re-enter points: ");
   point4 = scan.nextInt();
      }

 System.out.print ("Enter points earned by " + player5 + ": ");
 point5 = scan.nextInt();
 while (0>= point5)
 {
   System.out.println ("Enter only positive integers");
   System.out.print ("Please re-enter points: ");
   point5 = scan.nextInt();
  
   }

  PrintAs(player1, point1);
  PrintAs(player2, point2);
  PrintAs(player3, point3);
  PrintAs(player4, point4);
  PrintAs(player5, point5);
  }
  
  
public static void PrintAs(String Players, int PTs)
{
System.out.printf("%-10s", Players);
for(int i=0; i<PTs; i++)
System.out.print("*");
System.out.println();
}

  
 
 
 
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
