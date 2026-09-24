class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longest = 0;
        HashSet <Integer> num = new HashSet<>();

        for (int n : nums){
             num.add (n);
        }
        if (nums.length == 1 || num.size() == 1 ) return 1;

        for (int n : num) {
            if (!num.contains(n - 1)){
                int current = n;
                int length = 1;
                while (num.contains(current + 1)){

                current++;
                length++;
            }
            longest = Math.max(longest, length);
        }

            
        }
        return longest;
    }
}
