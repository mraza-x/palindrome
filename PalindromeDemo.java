/**
   Mohammed Raza
   CSC 236 - Lab4 #3 (main)
*/

import java.util.*;
import java.lang.*;

public class PalindromeDemo
{
   public static void main(String[] args)
   {
      StackClass<Character> charStack = new StackClass<Character>(50);
   
      try
      {
      
         String input;
         String input2;
         int index = 0;
      
         System.out.println("::: Is it a Palindrome? :::");
      
         Scanner keyboard = new Scanner(System.in);
      
         System.out.println("\nEnter a string: ");
         input = keyboard.nextLine();
         input2 = input.toLowerCase();
      
         for(int i=0; i < input2.length(); i++)
         {
            charStack.push(input2.charAt(i));
         }
      
         while(!charStack.isEmptyStack())
         {
         
            for(int i=0;i<input2.length();i++)
            {
            
               if(input2.charAt(i) == charStack.peek())
               {
                  index++;
               }
               
               else
               {
                  index--;
               }
            
               charStack.pop();
            }
         }
      
         if (index == input2.length())
            System.out.println("\n" + input + " is a palindrome.");
         
         else
            System.out.println("\n" + input + " is not a palindrome.");
      
      }
      
      catch (StackOverflowException sofe)
      {
         System.out.println(sofe.toString());
         System.exit(0);
      }
   
   }
}
