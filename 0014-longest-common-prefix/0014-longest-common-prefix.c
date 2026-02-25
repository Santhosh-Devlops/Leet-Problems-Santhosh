char* longestCommonPrefix(char** strs, int strsSize) {
    int k=0;
    int minLen = strlen(strs[0]);
    for(int i = 1; i < strsSize; i++)
        if(strlen(strs[i]) < minLen) minLen = strlen(strs[i]);
    char* res=(char*)malloc(strsSize*sizeof(int));
    for(int j = 0; j < minLen; j++){
        int match = 1;
        for(int i = 0; i < strsSize - 1; i++){
            if(strs[i][j] != strs[i+1][j]){
                match = 0;
                break;
            }
        }
        if(match) res[k++] = strs[0][j];
        else break;
    }
    res[k]='\0';
    return res;
}