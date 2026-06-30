class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        Boolean[] isprime = new Boolean[n];
        Arrays.fill(isprime,true);
        isprime[0] = false;
        isprime[1] = false;
        for(int i = 2;i*i<n;i++){
            if(isprime[i] == true){
                for(int j = i*i;j<n;j+=i){
                    isprime[j] = false;
                }
            }
        }
        int cnt = 0;
        for(Boolean val : isprime){
            if(val == true){
                cnt++;
            }
        }
        return cnt;
    }
}