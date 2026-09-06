class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int mask = 0;

        for (char c : allowed.toCharArray()) {
            mask = mask | (1 << (c - 'a'));
        }

        
     
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                int res = (1 << (c - 'a'));
                if ((mask & res) == 0) {
                    isConsistent = false;
                    break;
                }

            }

            if (isConsistent == true) {
                count++;
            }
        }


        return count;
    }
}