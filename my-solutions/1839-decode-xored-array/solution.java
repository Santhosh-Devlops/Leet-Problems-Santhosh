class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        int a=first;
        for(int i=0;i<encoded.length;i++){
            int num=encoded[i]^a;
            a=num;
            System.out.println(num);
            arr[i+1]=num;
        }
        return arr;
    }
}
