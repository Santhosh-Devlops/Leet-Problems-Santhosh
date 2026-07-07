class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt=0;
        for(List<String> x:items){
            if(ruleKey.equals("color") && ruleValue.equals(x.get(1))){
                cnt++;
            }
            if(ruleKey.equals("type") && ruleValue.equals(x.get(0))){
                cnt++;
            }
            if(ruleKey.equals("name") && ruleValue.equals(x.get(2))){
                cnt++;
            }
        }
        return cnt;

    }
}
