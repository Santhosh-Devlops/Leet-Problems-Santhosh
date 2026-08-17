class Solution {
    public int[] findArray(int[] pref) {
        int[] arr=new int[pref.length];
        arr[0]=pref[0];
        int val=0;
        for(int i=1;i<pref.length-1;i++){
            val=pref[i-1]^pref[i];
            arr[i]=val;
        }
        if(arr.length>1) arr[arr.length-1]=pref[pref.length-1]^pref[pref.length-2];
        return arr;
    }
}