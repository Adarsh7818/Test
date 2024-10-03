import java.util.HashSet;
import java.util.Scanner;

class LinkedList {
    Node head; 

    
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    void removeDuplicates() {
        Node current = head;
        Node prev = null;
        HashSet<Integer> seen = new HashSet<>();

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            llist.push(element);
        }

        System.out.println("Original Linked list:");
        llist.printList();

        llist.removeDuplicates();
        System.out.println("Linked list after removing duplicates:");
        llist.printList();

        scanner.close();
    }
}
