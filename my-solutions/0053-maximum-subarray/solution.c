int maxSubArray(int* nums, int numsSize) {
    int maxSum = nums[0], currentSum = nums[0];
    
    for (int i = 1; i < numsSize; i++) {
        currentSum = (currentSum > 0) ? currentSum + nums[i] : nums[i];
        if (currentSum > maxSum)
            maxSum = currentSum;
    }
    
    return maxSum;
}

