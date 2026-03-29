class Solution {
    private Map<Integer, List<Integer>> preReqMap = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for(int i = 0; i < numCourses; i++) {
            preReqMap.put(i, new ArrayList<>());
        }
        for(int[] preReq : prerequisites ) {
            preReqMap.get(preReq[0]).add(preReq[1]);
        }
        for(int i = 0; i < numCourses; i++) {
            if(!dfs(i)) return false;

        }
        return true;
        
    }
    private boolean dfs(int course) {

        if(visited.contains(course))
            return false;
        if(preReqMap.get(course).isEmpty())
            return true;
        visited.add(course);
        for(int preReq : preReqMap.get(course))
           if(!dfs(preReq))
             return false;
        visited.remove(course);
        return true;
    }

}
