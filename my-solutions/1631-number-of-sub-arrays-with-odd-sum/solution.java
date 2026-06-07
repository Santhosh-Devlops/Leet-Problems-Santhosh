class Solution {
    public int numOfSubarrays(int[] arr) {
        int nof=0,modulo=1000000007,odd=0,even=1,sum=0,i=0;
        while(i<arr.length){
            sum+=arr[i++];
            if(get(sum)){
                nof=(nof+even)%modulo;
                odd++;
            }else{
                nof=(nof+odd)%modulo;
                even++;
            }
        }
        return nof;
    }
    private boolean get(int val){
        return (val%2)!=0;
    }
}

