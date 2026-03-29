class LRUCache {

    private int cap;
    private Map<Integer, Node> cache; // map key to node
    Node left; // points to lease recently used node
    Node right; // points to recently used node
    class Node {

        Node prev;
        Node next;
        int val;
        int key;

        public Node(int key, int val) {
            prev = null;
            next = null;
            this.key = key;
            this.val = val;
        }

    }

    public LRUCache(int capacity) {
        left = new Node(0, 0);
        right = new Node(0, 0);
        left.next = right;
        right.prev = left;
        cache = new HashMap<>(); 
        this.cap = capacity;
    }
    // remove from the list
    private void remove(Node node) {
         
         Node prev = node.prev;
         Node next = node.next;
         prev.next = next;
         next.prev = prev;
         

    }
    // insert at right
    private void insert(Node node) {
       Node prev = right.prev;
       Node nxt = right;
       prev.next = nxt.prev = node;
       node.next = nxt; 
       node.prev = prev;
    }

    public int get(int key) {
        
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;    
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(cache.get(key));

        if(cache.size() > cap) {
            // remove from the list and delete the LRU from the cache
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
            

        }
    }
}
