class Solution {
    public int trap(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n-1;
        int lm = height[left];
        int water = 0;
        int rm = height[right];
        while(left < right){
            if(lm < rm){
                left++;
                lm = Math.max(lm,height[left]);
                water += lm - height[left];
            }
            else{
                right--;
                rm = Math.max(rm,height[right]);
                water += rm - height[right];

            }
        }
        return water;
    }
}