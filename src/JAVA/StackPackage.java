package JAVA;

import java.util.*;
import java.util.Stack;

public class StackPackage {

    public static void main(String [] args)
    {

     java.util.Stack<Character> stack = new java.util.Stack<>();
     String str = new String("name");
     char[] charArray = str.toCharArray();
     for(char c : charArray)
     {
        stack.push(c);
     }
     for(int i = 0 ; i< charArray.length ; i++)
     {
         System.out.println(stack.pop());
     }

     StackPackage sp = new StackPackage();
    // sp.findGreterInRight(new int[]{4, 7, 3, 4, 8, 1});
    // sp.findGreaterInRightStack(new int[]{4, 7, 3, 4, 8, 1});
    // sp.validParenthesis("{[]}");
        System.out.println(sp.validParenthesis("{[(]}"));


    }
    public void findGreterInRight(int[] arr)
    {
//        Stack<Integer> stack = new Stack<>();
//        for(int i : arr)
//        {
//            stack.push(arr[i]);
//        }
        //Brute force
        int[] tempArray = new  int[arr.length];
        int pos = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            for(int j = i+1 ; j< arr.length ; j++ )
            {
                if(arr[i] < arr[j])
                {
                    tempArray[pos] = arr[j];
                    pos++;
                    break;

                }

            }
        }
        for(int i = 0 ; i< tempArray.length ; i++)
        {
            System.out.println(tempArray[i]);
        }

    }
    public void findGreaterInRightStack(int[] arr)
    {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i>=0; i--)
        {
            if(!stack.isEmpty())
            {
                while(!stack.isEmpty() && stack.peek()<= arr[i])
                {
                    stack.pop();
                }
            }
            if(stack.isEmpty())
            {
                result[i] = -1;
            }
            else
            {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i = 0 ; i< result.length ; i++)
        {
            System.out.println(result[i]);
        }
    }

    public boolean validParenthesis(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
          if(c == '{' ||c == '[' ||c == '(')
          {
              stack.push(c);
          }
          else if(stack.isEmpty())
          {
              return  false;
          }
          else
          {
              char temp = stack.peek();
              if(c == '}' && temp == '{' ||
                      c == ']' && temp == '[' ||
                      c == ')' && temp == '(')
              {
                  stack.pop();
              }
              else
              {
                  return false;
              }
          }
        }
       return stack.isEmpty();


    }


}
