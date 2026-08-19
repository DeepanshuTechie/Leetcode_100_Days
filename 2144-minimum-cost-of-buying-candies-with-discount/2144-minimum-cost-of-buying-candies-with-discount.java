class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int m = 0;

        for (int i = cost.length - 1; i >= 2; i -= 3) {
            m += cost[i - 2];
        }

        int s = 0;

        for (int i = 0; i < cost.length; i++) {
            s += cost[i];
        }

        return s - m;
    }
}