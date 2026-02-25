class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l1=new ArrayList<>();
        HashMap<Integer,String> h1=new HashMap<>();
        h1.put(2, "abc");
        h1.put(3, "def");
        h1.put(4, "ghi");
        h1.put(5, "jkl");
        h1.put(6, "mno");
        h1.put(7, "pqrs");
        h1.put(8, "tuv");
        h1.put(9, "wxyz");
        String[] a=new String[101];
        if(digits.length()==1 && h1.containsKey(Integer.parseInt(String.valueOf(digits.charAt(0))))){
            for (char c : h1.get(Integer.parseInt(String.valueOf(digits.charAt(0)))).toCharArray()) {
                l1.add(String.valueOf(c));
            }
            return l1;
        }
        int k=0,l=0,j=0;
        while(k<digits.length()){
            Integer key = Integer.parseInt(String.valueOf(digits.charAt(k))); 
            if(h1.containsKey(key)){
                a[l]=h1.get(key);
            }
            k++;
            l++;
        }
        l1.add("");  
        while (j < l) {
            List<String> temp = new ArrayList<>();
            for (String prev : l1) {
                for (int n = 0; n < a[j].length(); n++) {
                    temp.add(prev + a[j].charAt(n));
                }
            }
            l1 = temp;  
            j++;
        }

        return l1;
    }
}