class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        int additional  = 0;
        int maxadditional = 0;
        int left = 0;
        for(int right = 0;right < grumpy.length;right++){
            if(grumpy[right] == 0){
                satisfied += customers[right];
            }
            else{
                additional+=customers[right];
            }
            if(right - left +1 == minutes){
                maxadditional = Math.max(maxadditional,additional);
                if(grumpy[left] == 1){
                    additional -= customers[left];
                   
                }
                left++;
            }
        }
        return satisfied + maxadditional;
    }
}