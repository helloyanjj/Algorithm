package leetcode;

import java.util.*;

public class LeetCode438 {

    public static List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length()) {
            return new ArrayList<>();
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        List<Integer> result = new ArrayList<>();

        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        int len = s.length(), n = p.length();
        int i = 0, j = n;

        while (i < len && j < len) {
            sCount[s.charAt(j) - 'a']++;
            sCount[s.charAt(i) - 'a']--;
            i++;
            j++;
            if (Arrays.equals(pCount, sCount)) {
                result.add(i);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(2);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.remove();
        arrayDeque.stream().forEach(r->{
            System.out.println(r);
        });

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.set(1,7);
        System.out.println(list.indexOf(7));
        for (Integer integer : list) {
            System.out.println(integer);
        }


        Vector<Integer> sss = new Vector<>();
        sss.add(1);
        sss.add(2);
        for (Integer integer : sss) {
            System.out.println(integer);
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


//        String s = "cbaebabacd",
//                p = "abc";
//
//        System.out.println(findAnagrams(s, p));
    }
}
