class Solution {
    public int majorityElement(int[] nums) {
        
        // The simplest way to find major elements is to sort out arrays first
        // Then return its sorted median 
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}