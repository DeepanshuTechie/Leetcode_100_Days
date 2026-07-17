class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int maxm = 0;
        int n = nums.length;
        int currcnt = 0;
        while(j<n){
            if(nums[j] == 1){
                
                currcnt++;
            }
            else{
                maxm = Math.max(currcnt,maxm);
                currcnt = 0;
            }
            j++;
        }
        return Math.max(currcnt,maxm);
    }
}