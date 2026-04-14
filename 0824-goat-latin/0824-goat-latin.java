class Solution {
    public String toGoatLatin(String sentence) {
        String[] a=sentence.split(" ");
        String[] b=new String[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if("aeiouAEIOU".contains(String.valueOf(a[i].charAt(0)))){
                String h="";
                for(int o=0;o<a[i].length();o++){
                    h+=a[i].charAt(o);
                }
                h+='m';
                int idx=i;

                for(int l=0;l<=i+1;l++){
                    h+='a';
                }
                b[k++]=h;
            }
            else{
                String h="";
                for(int j=1;j<a[i].length();j++){
                    h+=a[i].charAt(j);
                }
                h+=a[i].charAt(0);
                h+='m';
                int idx=i;

                for(int l=0;l<=i+1;l++){
                    h+='a';
                }
                b[k++]=h;
                
            }
        }
        String res="";
        for(int i=0;i<b.length;i++){
            res+=b[i];
            res+=' ';
        }
        String res1="";
        for(int i=0;i<res.length()-1;i++){
            res1+=res.charAt(i);
        }
        return res1;
    }
}