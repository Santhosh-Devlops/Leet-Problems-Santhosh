int divide(int dividend, int divisor) {
    if(dividend==0) return 0;
    if(dividend==-2147483648 && divisor==-1) return abs((long long)dividend-1);
    if(dividend<0 && divisor<0) return ceil((long int)dividend/divisor);
    return (long long)dividend/divisor;
}