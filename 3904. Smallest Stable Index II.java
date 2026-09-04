class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int size=nums.length;
        int[] sufmin=new int[size];
        int min=Integer.MAX_VALUE;
        for(int i=size-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            sufmin[i]=min;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            max=Math.max(max,nums[i]);
            if(max-sufmin[i]<=k){
                return i;
            }
        }
        return -1;
    }
}
