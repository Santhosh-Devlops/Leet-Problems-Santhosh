

char * interpret(char * command){
    int k=0;
    char* res=(char*)malloc(strlen(command)*3+1);
    for(int i=0;i<strlen(command);i++){
        if(command[i]=='(' && command[i+1]==')') {
            res[k++]='o';
        }
        else if(command[i]=='(' && command[i+1]=='a'&& command[i+2]=='l'&& command[i+3]==')') {
            res[k++]='a'; 
            res[k++]='l';
        }
        else if(command[i]=='G'){
            res[k++]='G';
        }
        else;
    }
    res[k]='\0';
    return res;
}