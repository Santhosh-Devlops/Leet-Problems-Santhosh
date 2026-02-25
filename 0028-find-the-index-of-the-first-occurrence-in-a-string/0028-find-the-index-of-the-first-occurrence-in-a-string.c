int strStr(char* haystack, char* needle) {
    if(!haystack) return -1;
    
    if(!needle || needle[0] == '\0') return 0; 
    
    int hayLen = strlen(haystack);
    int needleLen = strlen(needle);
    
    for(int i = 0; i <= hayLen - needleLen; i++) {
        int j;
        for(j = 0; j < needleLen; j++) {
            if(haystack[i + j] != needle[j]) {
                break; 
            }
        }
        if(j == needleLen) {
            return i;  
        }
    }
    
    return -1;  
}