class Solution {
    public int[] separateDigits(int[] nums) {
        int[] arr=new int[100000];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                arr[k++]=nums[i];
            }
            else{
                String s="";
                int temp=nums[i];
                while(temp>0){
                    int r=temp%10;
                    s+=r;
                    temp/=10;
                }
                for(int j=s.length()-1;j>=0;j--){
                    arr[k++]=s.charAt(j)-'0';
                }
            }
            
        }
        return Arrays.copyOf(arr,k);
    }
}
