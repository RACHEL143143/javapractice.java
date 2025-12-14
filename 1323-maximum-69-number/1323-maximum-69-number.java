class Solution {
    public int maximum69Number (int num) {
       int temp=num;
       int ind=-1;
       int pos=0;
        while(temp>0){
         if(temp%10==6)
         ind=pos;
        temp/=10;
        pos++;
        }
        return (ind==-1)?num:num+3*(int)Math.pow(10,ind);
    }
}