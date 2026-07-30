class Solution {
    List<List<Integer>> sol = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candi, int target) {
        Arrays.sort(candi);
        generate(0, new ArrayList<>(), candi, target);
        return sol;
    }

    public void generate(int i, List<Integer> arr, int[] candi, int t) {
        if (t < 0) return;

        if (t == 0) {
            sol.add(new ArrayList<>(arr));
            return;
        }

        for (int j = i; j < candi.length; j++) {
            if ((j == i || candi[j] != candi[j - 1]) && (candi[j] <= t)) {
                arr.add(candi[j]);
                generate(j + 1, arr, candi, t - candi[j]);
                arr.remove(arr.size() - 1);
            }
        }
    }
}