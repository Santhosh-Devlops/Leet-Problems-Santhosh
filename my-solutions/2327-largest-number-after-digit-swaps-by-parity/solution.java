class Solution {
    public int largestInteger(int num) {
        char[] c=String.valueOf(num).toCharArray();
        for(int i=0; i<c.length; i++)
            for(int j=i+1; j<c.length; j++)
                if(c[i]%2==c[j]%2 && c[j]>c[i]){
                    char t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
        return Integer.parseInt(new String(c));
    }
}

