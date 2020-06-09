class Solution {
    int[] w=null;

    public Solution(int[] w) {
        for(int i=1;i<w.length;i++){
            w[i]+=w[i-1];
    }
    this.w=w;
}
    public int pickIndex() {
        double val= w[w.length-1]*Math.random();
        int left=0, right=w.length;
        while(left < right){
            int mid=left+(right-left)/2;
            if(w[mid]<val){
                left=mid+1;
                
            }else
            {
            right = mid;    
            }
            
            
        }
        return left;
        
    }
}


