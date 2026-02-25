/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    int carry = 1;
    int* res = (int*)malloc((digitsSize + 1) * sizeof(int));

    for (int i = digitsSize - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        res[i + 1] = sum % 10;
        carry = sum / 10;
    }

    if (carry) {
        res[0] = carry;
        *returnSize = digitsSize + 1;
        return res;
    } else {
        for (int i = 0; i < digitsSize; i++)
            res[i] = res[i + 1];
        *returnSize = digitsSize;
        return res;
    }
}