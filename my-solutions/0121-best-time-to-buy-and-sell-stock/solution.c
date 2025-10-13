int maxProfit(int* prices, int pricesSize) {
    int min=prices[0];
    int temp=0,profit=0;
    for(int i=0;i<pricesSize;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        temp=prices[i]-min;
        if(profit<temp) profit=temp;
    }
    return profit;
}
