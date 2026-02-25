char * defangIPaddr(char * address){
    int k=0;
    char* a = malloc(strlen(address)*3+1);
    for(int i=0;i<strlen(address);i++){
        if(address[i]=='.'){
            a[k++]='[';
            a[k++]='.';
            a[k++]=']';
        }
        else{
            a[k++]=address[i];
        }
    }
    a[k]='\0';
    return a;
}