class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
       
        // Step 1: Define the search space for speed (k)
        int left = 1;
        int right = 0;
        
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        int minSpeed = right;
        
        // Step 2: Binary search for the minimum valid speed
        while (left <= right) {
            int k = left + (right - left) / 2;
            
            long totalHours = 0;
            for (int pile : piles) {
                // Ceiling division trick: (pile + k - 1) / k
                // This calculates how many hours it takes to eat this pile at speed k
                totalHours += (pile + k - 1) / k;
            }
            
            // Step 3: Check if Koko can finish within 'h' hours
            if (totalHours <= h) {
                minSpeed = k;      // Record this valid speed
                right = k - 1;     // Try to find an even slower (smaller) speed
            } else {
                left = k + 1;      // Too slow! Need to increase speed
            }
        }
        
        return minSpeed;
    }
}
