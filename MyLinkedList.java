public class MyLinkedList {
    
    private class Node {
        int val;
        Node next;
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    
    Node head = null;
    Node tail = null;
    int size = 0;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head == null || index >= size) {
            return -1;
        }
        Node current = head;
        int count = 0;
        while (count < index) {
            current = current.next;
            count++;
        }
        return current.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (size == 0) {
            head = tail = new Node(val, null);
            size++;
            return;
        }
        else {
            Node newNode = new Node(val, head);
            head = newNode;
            size++;
            return;
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val, null);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        else {
            Node current = head;
            int count = 0;
            while (count != index - 1) {
            	count++;
                current = current.next;
            }
            Node newNode = new Node(val, current.next);
            current.next = newNode;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) { //delete head
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return;
        }
        
        Node current = head;
        
        if (index == size) { //delete tail
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            size--;
            tail = current;
            return;
        }
       
        int count = 0; //index in between
        while (count != index - 1) {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
        size--;
        return;
    }
    
    /**
     * String format of the list.
     */
    public String toString() {
    	String answer = "";
    	for (int i = 0; i < size; i++) {
    		answer += get(i) + " -> ";
    	}
    	return answer;
    }
}
