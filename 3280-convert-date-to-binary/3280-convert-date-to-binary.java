class Solution {
    public String convertDateToBinary(String date) {
        String fin="";
        String a1=date.substring(0,4);
        String a2=date.substring(5,7);
        String a3=date.substring(8,10);
        fin+=conv(a1)+"-"+conv(a2)+"-"+conv(a3);
        return fin;
    }
    private String conv(String a){
        int n=Integer.parseInt(a);
        String b="";
        while(n>0){
            int r=n%2;
            b=r+b;
            n/=2;
        }
        System.out.println(b);
        return b;

    }
}