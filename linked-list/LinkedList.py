class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def printList(self):

        node = self.head
        while(node):
            print(node.data)
            node = node.next 

    def push(self, node):
        node.next = self.head
        self.head = node   

if __name__=="__main__":
    list = LinkedList()
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)

    list.head = node1
    node1.next = node2
    node2.next = node3

    node4 = Node(4)

    list.push(node4)

    list.printList()
