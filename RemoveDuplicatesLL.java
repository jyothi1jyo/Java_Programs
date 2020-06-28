package coreJava;


public class RemoveDuplicatesLL {
 
    static class Node {
        int data;
        Node next;
        Node(int tmp) {data = tmp;}
    }

    static void printLinkedList(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
 
    static void deleteDuplicates(Node head) {
     
        Node curr = head;
 
        Node temp = curr;
        while(curr != null) {
            
            while(temp != null && temp.data == curr.data) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = curr.next;
        }
    }
 
    public static void main(String[] a) {
 
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(9);
        Node n4 = new Node(4);
        Node n5 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

 
        System.out.print("Initial linked list data: ");
        printLinkedList(n1);
        deleteDuplicates(n1);
        System.out.println();
        System.out.print("Linked list data after removing duplicates: ");
        printLinkedList(n1);
    }
}
