class Solution {
    public int firstUniqChar(String s) {
        
        int[] count = new int[26];
        int num = s.length();
        
        for(int i = 0; i < num; i++)
        {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }
        
        for(int i = 0; i < num; i++)
        {
            int index = s.charAt(i) - 'a';
            if(count[index] == 1)
            {
                return i;
            }
        }
        
        return -1;
    }
}