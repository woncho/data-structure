class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}

public class LinkedList {
    public int data;
    public Node head;
    
    public LinkedList() {

    }

    public void printList() {
        Node node = head;

        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;

        list.printList();

    }
}

