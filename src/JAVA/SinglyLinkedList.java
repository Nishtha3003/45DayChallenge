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

       SinglyLinkedList sll = new SinglyLinkedList();
      // sll.printList(first);
      // sll.reverseSinglyLinkedList(first);
      //  sll.middleOfTheNode(first);
      //  sll.findNthElementFromEnd(3, first);
        sll.removeDublicateFromSinglyLinkedList(first);
    }
}
