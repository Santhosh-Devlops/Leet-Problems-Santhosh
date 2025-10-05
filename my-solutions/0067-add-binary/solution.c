char* addBinary(char* a, char* b) {
    int lenA = strlen(a);
    int lenB = strlen(b);
    int maxLen = (lenA > lenB) ? lenA : lenB;
    
    char* result = (char*)malloc(10000 * sizeof(char));
    int carry = 0;
    int i = lenA - 1;
    int j = lenB - 1;
    int k = 0,l=0;
    
    while (i >= 0 || j >= 0 || carry) {
        int sum = carry;
        
        if (i >= 0) sum += a[i--] - '0';
        if (j >= 0) sum += b[j--] - '0';
        
        result[k++] = (sum % 2) + '0';
        carry = sum / 2;
    }
    
    result[k] = '\0';
    while(l<k/2) {
        char temp = result[l];
        result[l] = result[k - 1 - l];
        result[k - 1 - l] = temp;
        l++;
    }
    
    return result;
}
