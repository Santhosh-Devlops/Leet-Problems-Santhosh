bool isValid(char* s) {
    if(!s) return true;
    int len = strlen(s);
    if(len == 0) return true;

    char stack[10000];
    int top = -1;

    for(int i = 0; i < len; i++){
        if(s[i] == '(' || s[i] == '{' || s[i] == '['){
            stack[++top] = s[i];
        } else {
            if(top == -1) return false;
            if(s[i] == ')' && stack[top] != '(') return false;
            if(s[i] == '}' && stack[top] != '{') return false;
            if(s[i] == ']' && stack[top] != '[') return false;
            top--;
        }
    }

    return top == -1;
}
