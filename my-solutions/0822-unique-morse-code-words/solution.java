class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int c=0;
        HashMap<Character,String> hs=new HashMap<>();
        hs.put('a', ".-");
        hs.put('b', "-...");
        hs.put('c', "-.-.");
        hs.put('d', "-..");
        hs.put('e', ".");
        hs.put('f', "..-.");
        hs.put('g', "--.");
        hs.put('h', "....");
        hs.put('i', "..");
        hs.put('j', ".---");
        hs.put('k', "-.-");
        hs.put('l', ".-..");
        hs.put('m', "--");
        hs.put('n', "-.");
        hs.put('o', "---");
        hs.put('p', ".--.");
        hs.put('q', "--.-");
        hs.put('r', ".-.");
        hs.put('s', "...");
        hs.put('t', "-");
        hs.put('u', "..-");
        hs.put('v', "...-");
        hs.put('w', ".--");
        hs.put('x', "-..-");
        hs.put('y', "-.--");
        hs.put('z', "--..");
        int k=0;
        String[] s1=new String[words.length];
        for(int i=0;i<words.length;i++){
            String s="";
            for(int j=0;j<words[i].length();j++){
                s+=hs.get(words[i].charAt(j));
            }
            s1[i]=s;
        }
        for(int i=0;i<s1.length;i++){
            int f=0;
            for(int j=0;j<i;j++){
                if(s1[i].equals(s1[j])) {f=1; break;}
            }
            if(f==0) c++;
        }
        return c;
    }
}
