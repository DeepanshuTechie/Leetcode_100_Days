class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxlen = 0;
        for(int i = 0;i<n;i++){
            int zerocnt = 0;
            for(int j = i;j<n;j++){
                if(nums[j] == 0){
                    zerocnt++;
                }
                if(zerocnt > k) break;

            maxlen = Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }
}