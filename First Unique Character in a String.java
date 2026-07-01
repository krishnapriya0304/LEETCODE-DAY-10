class Solution {
    public int firstUniqChar(String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            hash[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (hash[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}
