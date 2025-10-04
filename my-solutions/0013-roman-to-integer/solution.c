int romanToInt(char* s) {
    char r[7] = {'I','V','X','L','C','D','M'};
    int n[7] = {1,5,10,50,100,500,1000};
    int l = strlen(s), val = 0, i = 0;

    while(i < l){
        for(int j = 0; j < 7; j++){
            if(s[i] == r[j]){
                
                if(i+1 < l){
                    for(int k = 0; k < 7; k++){
                        if(s[i+1] == r[k] && n[j] < n[k]){
                            val -= n[j];
                            goto next;
                        }
                    }
                }
                val += n[j];
            }
        }
        next:
        i++;
       
    }
    return val;
}

