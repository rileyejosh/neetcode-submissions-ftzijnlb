class Deque {

    Node head;
    Node tail;
    int N;

    private static class Node{
        Node next;
        Node prev;
        int item;
    }

    public Deque() {
        head = null;
        tail = null;
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void append(int value) {
       Node newNode = new Node();
       newNode.item = value;
       if(isEmpty()) {
        head = tail = newNode;
        N++;
       } else {
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        N++;
       }
    }

    public void appendleft(int value) {
        Node newNode = new Node();
        newNode.item = value;
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        N++;
    }

    public int pop() {
        if(isEmpty()) return -1;
        else if(N==1) {
            int val = tail.item;
            head = tail = null;
            N--;
            return val;
        }
        else {
            int val = tail.item;
            tail = tail.prev;
            tail.next = null;
            N--;
            return val;
        }
        
    }

    public int popleft() {
        if(isEmpty()) return -1;
        else if(N==1) {
            int val = head.item;
            head = tail= null;
            N--;
            return val;
        }
        else {
            int val = head.item;
            head = head.next;
            head.prev = null;
            N--;
            return val;
        }
    }
}
