class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.empty()) return "";
        string st = strs[0];
        for(int i = 1;i<strs.size();i++){
            while(strs[i].find(st) != 0){
                st.pop_back();
                if(st.empty()) return "";
            }
        }
        return st;
    }
};