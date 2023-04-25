package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> re = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);

//            if (re.get(s1) == null){
//                ArrayList<String> values = new ArrayList<>();
//                values.add(s);
//                re.put(s1, values);
//            } else {
//                re.get(s1).add(s);
//            }

            List<String> strings = re.getOrDefault(s1, new ArrayList<>());
            strings.add(s);
            re.put(s1, strings);
        }
        return new ArrayList<List<String>>(re.values());

    }

    public static void main(String[] args) {

    }



}
