package JAVA;

import java.util.EmptyStackException;

public class Stack {
    public int length = 0;
    public LinkedList top;
    private  class LinkedList {

       public LinkedList next;
       public int data ;

        public LinkedList(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    public Stack(){
       top = null;
       length = 0 ;
    }
    public boolean isEmpty()
    {
        return length == 0;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        else
        {
            return top.data;
        }
    }
    public int getLength()
    {
        return length;
    }
    public void push(int data)
    {
        LinkedList temp = new LinkedList(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public void pop() {
        if (isEmpty()) {
         System.out.println("stack is empty");
        } else {
            LinkedList temp = top;
            temp = temp.next;
            top.next = null;
            top = temp;
            this.length--;
        }
    }

    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop();
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.getLength());

    }
}
