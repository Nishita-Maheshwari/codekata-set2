class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==null || s.isEmpty()) return true;
        int index=-1;
        for(char c:s.toCharArray()){
            index =t.indexOf(c,index+1);
            if(index==-1){
                return false;
            }
        }
        return true;
        
    }
}
