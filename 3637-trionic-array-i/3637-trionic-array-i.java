class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0,j=0,k=0,n=nums.length;
        
        
        if(n<4) return false;
        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0 || i==n-1) return false;
        j=i;
        while(j<n-1 && nums[j]>nums[j+1]){
            j++;
        }
        if(j==i || j==n-1) return false;
        k=j;
        while(k<n-1 && nums[k]<nums[k+1]){
            k++;
        }
        if(k==j || k!=n-1) return false;
        
        return true;
    }
}