class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        
        // int N = max(piles); // We need only need to iterate up to max pile size in array
        //                         // as higher speeds are unnecessary 
        // int k = 1; // hourly rate for eating bananas
        
        // for(int i = 0; i < N; i++) {
        //     long hours = 0;
        //     for(int pile : piles) {
        //        // use ceil to round up the nearest whole hour
        //        hours += (int)(Math.ceil((double)pile/k)); 
        //     }

        //     // the moment we get a bananas-per-hour eating rate k that yields hours that's 
        //     // within h we must return k as it gives us the maximum hours we
        //     // need to eat all piles within h hours.
        //     if(hours <= h) break;
        //     k++;
        // }

        return binarySearch(piles,h);
    }
    private int binarySearch(int[] piles, int h) {

        int left = 0;
        int right = max(piles);
        int minK = right; // assume min k is highest rate 
        while(left <= right) {
            long hours = 0;
            int k = (left+right)/2;
            for(int pile : piles) {
               // use ceil to round up the nearest whole hour
               hours += (Math.ceil((double)pile/k)); 
            }
            if(hours <= h) {
                minK = k;
                right = k - 1; // hours is in within the h threshold
                               // check if we can find smaller rate
            } else                // hours exceeds the h threshold
                left = k + 1;    //  increase rate of bananas eaten
        }
        return minK;
    }
    private int max(int[] piles) {

        int max = piles[0];
        for(int p : piles)
            max = Math.max(p, max);
        return max;
    }
}
