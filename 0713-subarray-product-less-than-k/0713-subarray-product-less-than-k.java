class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1) return 0;
        int l = 0;
        int cnt = 0;
        int p  = 1;
        int n = nums.length;
        for(int r = 0;r<n;r++){
            p*= nums[r];
            while( p >= k){
                p /=nums[l];
                l++;
            }
            cnt += r - l + 1;
        }
        return cnt;
    }
}