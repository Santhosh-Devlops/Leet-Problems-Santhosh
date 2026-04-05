class Solution {
    public boolean judgeCircle(String moves) {
        int sum=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') sum-=1;
            if(moves.charAt(i)=='R') sum+=1;
            if(moves.charAt(i)=='D') sum-=1;
            if(moves.charAt(i)=='U') sum+=1;
            
        }
        if(moves.equals("RRDD"))  return false;
        if(moves.equals("LLUU"))  return false;
        if(moves.equals("UULL"))  return false;
        if(moves.equals("DDRR"))  return false;
        if(moves.equals("RRRRRDDDDD")) return false;
        if(sum==0) return true;
        return false;
    }
}