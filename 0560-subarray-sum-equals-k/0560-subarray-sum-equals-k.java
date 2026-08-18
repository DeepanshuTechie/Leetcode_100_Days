class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int psum = 0;
        map.put(0,1);
        for(int val : nums){
            psum += val;

            if(map.containsKey(psum - k)){
                cnt += map.get(psum - k);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return cnt;
    }
}