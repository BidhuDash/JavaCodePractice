package DSA_CODES.LinkedList;


import javax.naming.NoInitialContextException;

/**
 * @Author Bidhu Dash
 * @Date 16-07-2024
 *
 *      SinglyLinkedList are unidirectional
 *      -->They are
 *
 */
public class SinglyLinkedList {

    //created Head node reference
    Node head;

    public static void main(String[] args) throws NoInitialContextException {

        SinglyLinkedList obj = new SinglyLinkedList();

        obj.insertAtBegin(5);
        obj.insertAtBegin(10);
        obj.insertAtEnd(55);
        obj.insertAtBegin(2);
        obj.insertAtBegin(44);
        obj.insertAtEnd(22);
        obj.insertAtNthPlace(11, 0);


        obj.printList(obj.head);
        System.out.println(obj.head.toString());

    }

    void insertAtBegin(int data) {
        //created a new node Object
        Node node = new Node(data);

        //assigned the new node.next variable as head node
        node.next = head;

        //replaced the head node with newly created node(data) as head
        head = node;

    }

    void insertAtEnd(int newData) {
        //created a new newNode with newData
        Node newNode = new Node(newData);

        //null check the head Node, if null then assign head as newNode
        if (head == null) {
            head = newNode;
        }

        // else traverse to the last node
        Node endNode = head;
        while (endNode.next != null) {
            endNode = endNode.next;
        }

        //assign next of last node to newNode
        endNode.next = newNode;
    }   

    void insertAtNthPlace(int newData, int position) throws Error {
        // check if the given position is at beginning
        if (position == 1) {
            insertAtBegin(newData);
            return;
        }

        if (position == 0) {
            throw new Error("0 position is not entertained Enter valid position");
        }

        //create new object using newData
        Node newNode = new Node(newData);

        //create previous node object and assign it to head node
        Node prevNode = head;

        //traverse is the position. next is not null
        for (int i = 1; i < position - 1; i++) {
            if (prevNode != null) {
                prevNode = prevNode.next;
            }
        }

        if (prevNode == null || prevNode.next == null) {
            System.out.println("The given position is out of bound");
            return;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void printList(Node head) {
        Node newNode = head;
        while (newNode != null) {
            System.out.println(newNode.data + " ");
            newNode = newNode.next;
        }
        System.out.println();
    }

    class Node {
        int data;
        Node next;

        Node(int d, Node next) {
            this.data = d;
            this.next = null;
        }

        Node(int d) {
            this.data = d;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
    }
}
