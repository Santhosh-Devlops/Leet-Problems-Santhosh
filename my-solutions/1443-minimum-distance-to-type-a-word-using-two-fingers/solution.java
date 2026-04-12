class Solution {
    public int minimumDistance(String w) {
        char[][] m={
            {'A','B','C','D','E','F'},
            {'G','H','I','J','K','L'},
            {'M','N','O','P','Q','R'},
            {'S','T','U','V','W','X'},
            {'Y','Z','\0','\0','\0','\0'}
        };

        Integer[][][] dp=new Integer[w.length()][27][27];

        return new Object(){
            int f(int i,int a,int b){
                if(i==w.length()) return 0;
                if(dp[i][a][b]!=null) return dp[i][a][b];

                char c=w.charAt(i);
                int x=0,y=0;

                for(int r=0;r<5;r++)
                    for(int c1=0;c1<6;c1++)
                        if(m[r][c1]==c){ 
                            x=r; 
                            y=c1; 
                        }

                int d1=0,d2=0;

                if(a!=26){
                    char p=(char)(a+'A');
                    int px=0,py=0;
                    for(int r=0;r<5;r++)
                        for(int c1=0;c1<6;c1++)
                            if(m[r][c1]==p){ 
                                px=r; 
                                py=c1; 
                            }
                    d1=Math.abs(px-x)+Math.abs(py-y);
                }

                if(b!=26){
                    char p=(char)(b+'A');
                    int px=0,py=0;
                    for(int r=0;r<5;r++)
                        for(int c1=0;c1<6;c1++)
                            if(m[r][c1]==p){ 
                                px=r; 
                                py=c1; 
                            }
                    d2=Math.abs(px-x)+Math.abs(py-y);
                }

                return dp[i][a][b]=Math.min(
                    d1+f(i+1,c-'A',b),
                    d2+f(i+1,a,c-'A')
                );
            }
        }.f(0,26,26);
    }
}

