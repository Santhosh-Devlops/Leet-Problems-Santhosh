bool isHappy(int n) {
    int num[300],k=0;
    int m=0;
    if(n==1||n==7) return true;
    else if(n<10) return false;
    else{
        while(n>0 && k<n){
            int r=n%10;
            m=m+(r*r);
            n=n/10;
        }
        return isHappy(m);
    }
}