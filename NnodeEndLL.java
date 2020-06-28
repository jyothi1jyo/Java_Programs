package coreJava;

public class NnodeEndLL {
 
    static class Node {
        int data;
        Node next;
        Node(int tmp) {data = tmp;}
    }
 
    static Node direct(Node head, int n) {
        Node temp = head;
        if(head == null) {
            return null;
        }
        for(int i=0;i<n-1;i++) {
            if(temp == null) {
                System.out.println("The n input size is more than linked list size");
                return null;
            }
            temp = temp.next;
        }
        return temp;
    }
 
    public static void main(String[] a) {
 
        Node n1 = new Node(3);
        Node n2 = new Node(59);
        Node n3 = new Node(9);
        Node n4 = new Node(8);
        Node n5 = new Node(0);
       
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
 
        Node nNode = direct(n1, 5);
        System.out.println("Nth node value: "+nNode.data);
    }
}