package lec46;
import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = group_Anagrams(arr);
        System.out.println(result);
    }

    public static List<List<String>> group_Anagrams(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : arr) {
            String key = GetKey(str);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static String GetKey(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i]).append("#");
        }
        return sb.toString();
    }
}
