class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int numOfJewel = 0;
        
        Set set = new HashSet();
        for(char c: J.toCharArray())
            set.add(c);
        
        for(char s: S.toCharArray())
            if(set.contains(s))
                numOfJewel++;
        
        return numOfJewel;
    }
}