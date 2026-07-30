class Solution {
private:
    int lowerBound(vector<int>& nums, int x, int n) {
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    int upperBound(vector<int>& nums, int x, int n) {
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int first = lowerBound(nums, target, n);
        if (first == n || nums[first] != target) {
            return {-1, -1};
        }
        int last = upperBound(nums, target, n) - 1;
        return {first, last};
    }
};