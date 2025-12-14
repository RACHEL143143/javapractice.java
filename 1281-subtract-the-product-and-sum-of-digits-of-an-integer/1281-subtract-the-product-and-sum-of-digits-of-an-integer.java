class Solution {
    public int subtractProductAndSum(int n) {
       int sum=0,mul=1;
        while(n>0){
            int a=n%10;
            int b=n%10;
            sum+=a;
            mul*=b;
            n/=10;
        }
        return (mul-sum);
    }
    
}