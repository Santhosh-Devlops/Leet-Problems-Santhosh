class Solution { 
    public String discountPrices(String sentence, int discount) { 
        String[] a=sentence.split(" "); 
        String st=""; 
        for(int i=0;i<a.length;i++){ 
            if(a[i].startsWith("$") && a[i].length()>1 && isDigits(a[i].substring(1))){ 
                String b=a[i].substring(1); 
                double val=Double.parseDouble(b)*((100.0-(double)discount)/100.0); 
                st+="$"; 
                st+=String.format("%.2f",val); 
            } else{ 
                st+=a[i]; 
            } 
            if(i!=a.length-1){ 
                st+=" "; 
            } 
        } 
        return st; 
    } 
    private boolean isDigits(String s) {
        for(char c:s.toCharArray()) {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }
}
