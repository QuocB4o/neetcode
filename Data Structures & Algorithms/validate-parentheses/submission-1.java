class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> pairs = new HashMap <>();

        pairs.put (')', '(');
        pairs.put ('}', '{');
        pairs.put (']','[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            //c is closing bracket

            if(pairs.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != pairs.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty(); 
    }
}
