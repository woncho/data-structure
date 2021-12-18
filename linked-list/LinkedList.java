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
        System.out.println("Printing...");
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void printList(Node head) {
        Node node = head;
        System.out.println("Temp Soring...");
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void push(Node node) {
        node.next = head;
        head = node;
    }

    public void append(Node node) {
        Node curr = head;

        while(curr != null) {

            if(curr.next == null) {
                curr.next = node;
                break;
            }
            curr = curr.next;
        }
    }

    public void insertAt(Node node, Node prev) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == prev.data){
                node.next = prev.next;
                curr.next = node;

            }
            curr = curr.next;
        }
    }

    public void sort() {
        Node tmpHead = null;
        Node curr = this.head;
    
        System.out.println("Sorting...");
        while(curr != null) {
            
            Node newNode = new Node(curr.data);
            //System.out.println(newNode.data);

            tmpHead = insertionSort(tmpHead, newNode);
            printList(tmpHead);
            curr = curr.next;
        }

        
        this.head = tmpHead;

    }

    public Node insertionSort(Node head, Node node) {
        Node prevNode = null;
        Node currNode = head;

        while(true) {

            if (currNode == null) {
                
                head = node;
                break;
            }

            if(node.data <= currNode.data) {
                if (prevNode == null) {
                    head = node;
                    
                } else {
                    prevNode.next = node;
                    
                }
                node.next = currNode;
                break;
            } else {
                if(currNode.next == null) {
                    currNode.next = node;
                    break;       
                }
            }

            prevNode = currNode;
            currNode = currNode.next;
        }

        return head;

    }

       
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;

        Node node4 = new Node(4);
        list.push(node4);

        Node node5 = new Node(5);
        list.append(node5);

        Node node6 = new Node(6);

        list.insertAt(node6, node2);

        list.printList();

        list.sort();
        list.printList();

    }
}

