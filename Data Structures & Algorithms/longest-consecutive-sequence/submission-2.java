class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1 ) return 1;
        int length = 0;
        HashSet <Integer> num = new HashSet<>();

        for (int n : nums){
            if (num.contains(n)) continue;
            else num.add (n);
        }

        for (int i = 0; i < nums.length; i++){
            if (num.contains(nums[i] + 1)){
                length++;
            }
        }
        return length;
    }
}
