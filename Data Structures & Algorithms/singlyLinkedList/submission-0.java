class LinkedList {

    Node head;
    Node tail;
    int N;

    private static class Node {
        Node next;
        int item;
    }

    public LinkedList() {
        head = null;
        tail = null;
        N = 0;
    }

    public int get(int index) {
        if(head == null)
            return -1;
        int i = 0;
        for(Node x = head; x != null; x = x.next) {
            if(i == index)
                return x.item;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        if(head == null) {
            head = new Node();
            head.item = val;
            tail = head;
            N++;
        } else {
            Node oldHead = head;
            head = new Node();
            head.item = val;
            head.next = oldHead;
            N++;
        }
    }

    public void insertTail(int val) {
        if(head == null) {
            tail = new Node();
            tail.item = val;
            head = tail;
            N++;
        } else {
            Node oldTail = tail;
            tail = new Node();
            tail.item = val;
            oldTail.next = tail;
            N++;
        }
    }

public boolean remove(int index) {
    
    if (head == null || index < 0 || index >= N) {
        return false; // Invalid index
    }

    // Special case: Remove the first node
    if (index == 0) {
        head = head.next;
        N--;
        if (N == 0) {
            tail = null; // If the list is now empty, update tail
        }
        return true;
    }

    // Special case: Remove the last node
    if (index == N - 1) {
        Node current = head;
        while (current.next != tail) { // Stop at the second-to-last node
            current = current.next;
        }
        current.next = null;
        tail = current;
        N--;
        return true;
    }

    // General case: Remove a node at a specific index
    Node current = head;
    for (int i = 0; i < index - 1; i++) { // Stop at the node before the one to be removed
        current = current.next;
    }
    current.next = current.next.next;
    N--;
    return true;
}


    public ArrayList<Integer> getValues() {
        ArrayList<Integer> l = new ArrayList<>();
        for(Node x = head; x != null; x = x.next) {
            l.add(x.item);
        }
        return l;
    }
}
