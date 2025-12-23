class Solution {
    public int lengthOfLastWord(String s) {
       String []arr=s.split(" ");
       int a=arr.length;
       int word=arr[a-1].length(); 
        return word;
    }
   
}