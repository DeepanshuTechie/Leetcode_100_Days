class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
       
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(check(s,i,j)){
                    if((j - i + 1) > ans.length()){
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    private Boolean check(String s,int i,int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 
}