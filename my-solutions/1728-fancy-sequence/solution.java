class Fancy {
    long[] arr=new long[100001]; 
    int size=0;
    long mod=1000000007;
    long m=1, a=0;

    public Fancy() {}

    public void append(int val){
        long inv=pow(m, mod-2);
        arr[size++]=((val-a+mod)%mod*inv)%mod;
    }

    public void addAll(int inc){
        a=(a+inc)%mod;
    }

    public void multAll(int m_val){
        m=(m*m_val)%mod;
        a=(a*m_val)%mod;
    }

    public int getIndex(int idx){
        if(idx>=size) return -1;
        return (int)((arr[idx]*m+a)%mod);
    }

    private long pow(long b, long e){
        long r=1;
        while(e>0){
            if(e%2==1) r=(r*b)%mod;
            b=(b*b)%mod;
            e/=2;
        }
        return r;
    }
}

