int hammingWeight(int n) {
    int binaryArray[32];
    int i = 0,count=0;
    while (n > 0) {
        binaryArray[i] = n % 2; 
        n = n / 2;   
        i++;
    }
    for(int j=0;j<i;j++){
        if(binaryArray[j]==1){
            count++;
        }
    }
    return count;

}
