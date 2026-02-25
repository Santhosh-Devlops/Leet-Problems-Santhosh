bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    int arr[40],arr1[40];
    int j=0,k=0;
    int n;
    while(x){
        n=x%10;
        arr[k++]=n;
        x=x/10;
    }
    for(int i=k-1;i>=0;i--){
        arr1[j++]=arr[i];
    }
    for(int i=0;i<k;i++){
        if(arr1[i] != arr[i]){
            return false;
        }
    }
    return true;

}