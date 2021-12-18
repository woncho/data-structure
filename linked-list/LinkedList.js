class LinkedList {
    constructor() {
        this.head = null;
    }

    printList() {
        let node = this.head;

        while(node != null) {
            console.log(node.data);
            node = node.next;
        }
    }

    push(node) {
        node.next = this.head;
        this.head = node;
    }
}

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

function main() {
    const list = new LinkedList();
    const node1 = new Node(1);
    const node2 = new Node(2);
    const node3 = new Node(3);

    list.head = node1;
    node1.next = node2;
    node2.next = node3;

    const node4 = new Node(4);
    list.push(node4)

    list.printList();
}

main();