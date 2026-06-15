class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n!=m) return false;
        if(s1.equals(s2)) return true;
        int c=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
            }
        }
        int k=0;
        int cnt=0;
        while(k<n){
            if(s1.charAt(k)==s2.charAt(k)){
                cnt++;
                System.out.println(cnt);
            }
            else{
                int idx=-1;
                for(int i=0;i<n;i++){
                    if(i!=k && s1.charAt(i)!=s2.charAt(i)){
                        idx=i;
                    }
                }
                if(idx!=-1 && s1.charAt(k)==s2.charAt(idx)){
                    cnt++;
                    System.out.println(cnt);
                }
            }
            k++;
        }
        if(c==2 && cnt==n) return true;
        return false;
    }
}
