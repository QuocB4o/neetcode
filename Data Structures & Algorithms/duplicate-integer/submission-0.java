class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();

        int i = 0;
        while (i < nums.length){
            if (map.containsKey(nums[i])) return true;
            else map.put (nums[i], i);
            i++;
        }
        return false;
    }
}