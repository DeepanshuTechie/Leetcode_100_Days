class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newarr = new int[m + n];
        int i = 0;int j = 0;int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                newarr[k++] = nums1[i++];
            }
            else{
                newarr[k++] = nums2[j++];
            }
        }
        while(i != m) newarr[k++] = nums1[i++];
        while(j != n) newarr[k++] = nums2[j++];
         for(int p = 0; p < m + n; p++){
            nums1[p] = newarr[p];
         }
    }
}