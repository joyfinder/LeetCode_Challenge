class Solution {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] letter = new int[26];
        boolean unableConstruct = false;
        for(char word : magazine.toCharArray())
        {
            letter[word - 'a']++;
        }
        
        for(char word : ransomNote.toCharArray())
        {
            if(letter[word - 'a'] == 0)
            {
                return unableConstruct;
            }
            letter[word - 'a']--;
        }
        return true;
    }
}