class Solution {
    private static boolean isA(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] at=new char[a.length()];
        char[] bt=new char[b.length()];
        at=a.toCharArray();
        bt=b.toCharArray();
        Arrays.sort(at);
        Arrays.sort(bt);
        return Arrays.equals(at,bt);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
        boolean[] vis=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> l1=new ArrayList<>();
            if(vis[i])
                continue;

            vis[i]=true;
            l1.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(!vis[j] && isA(strs[i],strs[j])){
                    vis[j]=true;
                    l1.add(strs[j]);
                }
            }
            l.add(l1);
        }
        return l;
    }
}
