int lengthOfLastWord(char* s) {
    int n = 0;
    int len = strlen(s) - 1;
    while (len >= 0 && s[len] == ' ') len--;
    while (len >= 0 && s[len] != ' ') {
        n++;
        len--;
    }
    return n;
}

