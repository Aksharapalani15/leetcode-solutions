 
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()) {
            return result;
        }

        int[] freq = new int[26];
        int[] win = new int[26];

        int n = p.length();

        for(int i = 0; i < n; i++) {
            freq[p.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++) {
            win[s.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = n - 1;

        while(right < s.length()) {

            if(Arrays.equals(freq, win)) {
                result.add(left);
            }

            if(right + 1 < s.length()) {

                win[s.charAt(left) - 'a']--;
                win[s.charAt(right + 1) - 'a']++;

                left++;
                right++;
            } else {
                break;
            }
        }

        return result;
    }
}
