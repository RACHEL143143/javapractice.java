class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String a:operations){
            if("X++".equals(a)||"++X".equals(a)){
                x++;
            }else{
                x--;
            }

        }
        return x;
    }
}