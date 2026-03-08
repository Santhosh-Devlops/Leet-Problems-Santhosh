import java.math.*
;class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int l=nums[0].length();
        System.out.println((int)Math.pow(2,l));
        int n=(int)Math.pow(2,l);
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=String.format("%"+l+"s",Integer.toBinaryString(i)).replace(' ','0');
        }
        for(int i=0;i<n;i++){
            boolean f=false;
            for(int j=0;j<nums.length;j++){
                if(a[i].contains(nums[j])){
                    f=true;
                    break;
                }
            }
            if(!f){
                return a[i];
            }
        }
        return "";
    }
}
