int reverse(int x){
    long long k=0,temp=x;
    int count=0;
    while(x!=0){
        int r=x%10;
        k=(k*10)+r;
        x=x/10;
    }
    if (k>INT_MAX||k<INT_MIN) return 0;
    return (int)k;
}
