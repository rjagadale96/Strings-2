// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



class Solution {
    public int strStr(String haystack, String needle) {
        
        int m=haystack.length();
        int n=needle.length();
        if(n==0){return 0;}
        if(n>m){return -1;}
        for(int i=0;i<m-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
