class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for (String s : strs){
            string.append(s.length());
            string.append('#');
            string.append(s);
        }

        return string.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        int i = 0;
        while (i < str.length()){
            int j = i;

            while (str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i , j));
            String word = str.substring(j + 1, j + 1 + length);
            decoded_strs.add(word); 
            
            i = j + 1 + length;
        }
    return decoded_strs;
    }
}
