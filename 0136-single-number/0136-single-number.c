int singleNumber(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++){
        int flag=1;
        for(int j=0;j<numsSize;j++){
            if(i != j && nums[i] == nums[j]){
                flag=0;
                break;
            }
            else ;
        }
        if(flag) return nums[i]; 
    }
    return -1;
    
}