class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,c=0;
        for(int i=0;i<events.length;i++){
            if(events[i].equals("0") || events[i].equals("1") || events[i].equals("2") || events[i].equals("3") || events[i].equals("4") || events[i].equals("6")){
                score+=Integer.parseInt(events[i]);
            }
            if(events[i].equals("W")) c++;
            if(events[i].equals("WD") || events[i].equals("NB")) score++;
            if(c==10) break;
        }
        return new int[]{score,c};
    }
}
