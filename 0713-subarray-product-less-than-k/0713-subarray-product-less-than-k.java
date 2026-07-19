class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0;i<n;i++){
            int p = 1;
            for(int j = i;j>=0;j--){
                p*=nums[j];
                if(p < k){
                    cnt++;
                }
                else{
                    break;
                }
            }
        }
        return cnt;
    }
}