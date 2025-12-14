class Solution {
    public long removeZeros(long n) {
       long res=0;
        long curr=0;
        while(n>0){
            if(n%10==0){
                n=n/10;
                continue;
            } 
            res+=n%10*Math.pow(10,curr);
            curr++;
            n=n/10;
        }
        return res;
    } 
}