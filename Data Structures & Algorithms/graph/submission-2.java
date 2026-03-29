class Graph {

    Map<Integer, Set<Integer>> graph;
    public Graph() {
        graph = new HashMap<>();
    }

    public void addEdge(int src, int dst) {
        // If src or dst don't exist, add them
        graph.putIfAbsent(src, new HashSet<>());
        graph.putIfAbsent(dst, new HashSet<>());
        // Add edge if not already exists
        graph.get(src).add(dst);
    }

    public boolean removeEdge(int src, int dst) {

        if(graph.containsKey(src)) {
            Set<Integer> neighbors = graph.get(src);
            return neighbors.remove(Integer.valueOf(dst));
        }

        return false;
    }

    public boolean hasPath(int src, int dst) {
        
        Deque<Integer> q = new LinkedList();
        Set<Integer> s = new HashSet<>();
        q.offer(src);
        s.add(src);
        while(!q.isEmpty()) {
            int qLen = q.size();
            for(int i = 0; i < qLen; i++) {
                 int curr = q.peek();
                 System.out.print(curr + " ");
                 q.poll();
                 if(curr == dst)
                    return true;         
                for(int neighbor : graph.get(curr)) {
                    if(!s.contains(neighbor)) {
                        s.add(neighbor);
                        q.offer(neighbor);
                    }
                }
            }
            System.out.println();

        }

        return false;

    }
}
