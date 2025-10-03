char* restoreString(char* s, int* indices, int indicesSize) {
    char* a=(char*) malloc((indicesSize+1)*sizeof(char));
    for(int i=0;i<indicesSize;i++){
        a[indices[i]]=s[i];
    }
    a[indicesSize]='\0';
    return a;
}
