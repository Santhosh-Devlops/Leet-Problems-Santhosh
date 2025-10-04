/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    int* res=(int*)malloc(2*(numsSize+2)*sizeof(int));
    for(int i=0;i<numsSize;i++){
        res[i]=nums[i];
        res[i+numsSize]=nums[i];
    }
    *returnSize = 2 * numsSize;

    res[*returnSize]='\0';
    return res;
}
