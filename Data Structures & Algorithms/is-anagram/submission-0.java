
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        java.util.HashMap<Character, Integer> map =
                new java.util.HashMap<>();
                
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);

            map.put (c, map.getOrDefault(c, 0) + 1);
            i++;
        }

        i = 0;
        while(i < t.length()){
            char c = t.charAt(i);

            if(!map.containsKey(c)) return false;

            int count = map.get(c) - 1;

            if(count == 0) map.remove(c);
            else map.put(c, count);

            i++;
        }

        return map.isEmpty();
    }
}
