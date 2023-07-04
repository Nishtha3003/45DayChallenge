package JAVA;

public class SinglyLinkedList {
    private static class Node {
        public int data;
        public Node next;

        public  Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void printList(Node node)
    {
        do{
            System.out.println(node.data);
            node = node.next;
        }
        while(node != null);
    }

    public void reverseSinglyLinkedList(Node node)
    {
        Node current = node;
        Node next = null;
        Node previous = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        printList(previous);
    }
    public void middleOfTheNode(Node node)
    {
        Node fastPointer = node;
        Node slowPointer = node;
        while(fastPointer != null && fastPointer.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

        }
        System.out.println(slowPointer.data);
    }
    public  void findNthElementFromEnd(int n , Node node)
    {
        Node temp1 = node;
        Node temp2 = node;
        int count = 0;
        while(count < n)
        {
            temp2 = temp2.next;
            count++;
        }
        while(temp2 != null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        System.out.println(temp1.data);

    }
    public void removeDublicateFromSinglyLinkedList(Node node)
    {
        Node current = node;
        while(current != null && current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }

        }
        printList(node);
    }
    public Node detectLoopInList(Node head) {
        Node fastPointer = head;
        Node slowPointer = head;
        while (fastPointer != null || fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                System.out.println("loop present");
                return slowPointer;
               // break;
            }
        }
        return  null;
      //  System.out.println("loop not present");
    }
    public void findStartOfTheLoop(Node head)
    {
        Node slowPointer = detectLoopInList(head);
        Node temp = head;
        while(temp != slowPointer)
        {
          temp = temp.next;
          slowPointer = slowPointer.next;

        }
        System.out.println(temp.data);
    }
    public  void removeLoopFromSinglyLinkedList(Node head)
    {
        Node slowPointer = detectLoopInList(head);
        Node temp = head;
        if(slowPointer != null)
        {
            while(slowPointer.next != temp.next)
            {
                slowPointer = slowPointer.next;
                temp = temp.next;
              //  System.out.println("loop still present");
            }
            slowPointer.next = null;
            printList(head);

        }
        else {
            System.out.println("loop still present");
        }

//        Node detectNode = detectLoopInList(head);
//        if(detectNode != null)
//        {
//            System.out.println("loop still present");
//        }
//        else
//        {
//            printList(head);
//        }
    }
    public void mergeTwoSortedList(Node a, Node b)
    {
        Node dummy = new Node(0);
        Node temp = dummy;
        while(a != null && b != null)
        {
            if(a.data <= b.data)
            {
                temp.next = a;
                a = a.next;
            }
            else
            {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
           // System.out.println("loop");
        }
        if(a == null)
        {
            temp.next = b;
        }
        else
        {
            temp.next = a;
        }
        printList(dummy);
    }

    public void sumOfTwoList(Node a, Node b)
    {
        int carry = 0;
        Node dummy = new Node(0);
        Node tail = dummy;
       // int sum
        while(a != null || b != null)
        {
            int x = 0;
            int y = 0;
            int sum = 0;
            if(a != null)
            {
               x = a.data;
            }
            else
            {
                x = 0;

            }

            if(b != null)
            {
                y = b.data;
            }
            else
            {
                y = 0;
            }
            sum = carry + x + y;
            carry = sum/10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
            if(a != null)
            {
                a = a.next;
            }
            if(b != null)
            {
                b = b.next;
            }
            System.out.println("printing");
        }
        if(carry > 0)
        {
            tail.next = new Node(carry);
        }
        printList(dummy.next);

    }
    public static void main(String[] args)
    {
       Node first = new Node(1);
       Node secound = new Node(2);
       Node third = new Node(3);
       Node fourth = new Node(4);
       Node fifth = new Node(4);
       Node sixth = new Node(5);
       Node seventh = new Node(5);
       secound.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = sixth;
       sixth.next = seventh;
       first.next= secound;
      // seventh.next = ;
       SinglyLinkedList sll = new SinglyLinkedList();
      // sll.printList(first);
      // sll.reverseSinglyLinkedList(first);
      //  sll.middleOfTheNode(first);
      //  sll.findNthElementFromEnd(3, first);
      //  sll.removeDublicateFromSinglyLinkedList(first);
      //  sll.findStartOfTheLoop(first);
       // sll.removeLoopFromSinglyLinkedList(first);
       // sll.printList(first);
        Node merge1 = new Node(3);
        Node merge2 = new Node(7);
        Node merge3 = new Node(10);
        merge1.next = merge2;
        merge2.next = merge3;
       // sll.mergeTwoSortedList(merge1,first);
        sll.sumOfTwoList(merge1,first);
    }
}
