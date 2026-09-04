class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            
            
            max = Math.max(max, nums[i]);
            if (nums.length == 1) {
                if (nums[i] <= k) {
                    return i;
                }
            }
            int min = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
            }
            if (max - min <= k) {
                idx = i;
                break;
            }
        }
        if (idx == Integer.MAX_VALUE) {
            return -1;
        }
        return idx;
    }
}
