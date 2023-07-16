package JAVA;

import java.util.EmptyStackException;

public class StackArray {
    int[] arr ;
    int top;
    public StackArray(int size)
    {
     top = -1;
     arr = new int[size];
    }
    public boolean isEmpty()
    {
        return top < 0;
    }
    public int peek()
    {
        return arr[top];
    }

    public int getLength(){
        return top+1;
    }

    public void push(int data)
    {
        if(top < arr.length)
        {
            top++;
            arr[top] = data;
        }
        else
        {
            System.out.println("Stack is full");
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
          //  throw new EmptyStackException();
        }
        else
        {
            int temp =  arr[top];
            top-- ;
            return temp;
        }
    }

    public static void main (String[] args)
    {
        StackArray st = new StackArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.getLength());

    }
}
