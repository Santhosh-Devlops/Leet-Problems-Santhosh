class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;

        int l=0,r=s.length()-1;
        String ans="";

        while(l<s.length()){
            r=s.length()-1;

            while(l<r){
                if(s.charAt(l)==s.charAt(r)){
                    int a=l,b=r;

                    while(a<b && s.charAt(a)==s.charAt(b)){
                        a++;
                        b--;
                    }

                    if(a>=b && r-l+1>ans.length())
                        ans=s.substring(l,r+1);
                }
                r--;
            }

            if(ans.length()==s.length()-l)
                break;

            l++;
        }

        if(ans.equals(""))
            ans=s.substring(0,1);

        return ans;
    }
}
