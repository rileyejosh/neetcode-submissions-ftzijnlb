class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        int[][] cars = new int[N][2];
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < N; i++) {

            cars[i][0] = position[i];
            cars[i][1] = speed[i];

        }

        Arrays.sort(cars, (a1, a2)-> Integer.compare(a2[0], a1[0]));
        for(int[] r : cars) {
            System.out.println(r[0] + " " + r[1]);
        }
        for(int[] c : cars) {
            
            double distance = target-c[0];
            double time = distance / c[1];
            System.out.println(time);
            if(!stack.isEmpty() && time <= stack.peek()) 
                continue;
            stack.push(time);
            

        }

        return stack.size();

    }
}
