class Solution{
    public List<Integer> findValidElements(int[] nums){
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        if(n==0)return res;

        res.add(nums[0]);

        for(int i=1;i<n-1;i++){
            boolean l=true,r=true;

            for(int j=0;j<i;j++)
                if(nums[i]<=nums[j]){l=false;break;}

            for(int j=i+1;j<n;j++)
                if(nums[i]<=nums[j]){r=false;break;}

            if(l||r)res.add(nums[i]);
        }

        if(n>1)res.add(nums[n-1]);
        return res;
    }
}
