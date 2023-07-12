package newstart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 题目1：给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了不止一次。找出那个只出现了一次的元素。
 * 示例 :
 * 输入: [2,2,3,2,4,5,4,5,5]
 * 输出: 3
 * class Solution {
 *     public int singleNumber(int[] nums) {
 *     }
 * }
 */

public class MinSheng {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer m : nums) {
            if (!hashMap.containsKey(m)) {
                hashMap.put(m, 1);
            } else {
                hashMap.put(m, hashMap.get(m) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        Set<Integer> set =  hashMap.keySet();
        for (Integer s : set) {
            hashMap.get(s);
        }

        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] num = new int[]{2, 2, 3, 2, 4, 5, 4, 5, 5};
        System.out.println(singleNumber(num));
    }
}

//题目3：
//        大学生春季运动会的数据库，保存了比赛信息的三个表如下：
//        运动员sporter（运动员编号sporterid，姓名name，性别sex，所属系号department），
//        项目item（项目编号itemid，名称itemname，比赛地点location），
//        成绩grade（运动员编号id，项目编号itemid，积分mark）
//        用SQL语句完成在“游泳馆”进行比赛的各项目名称及其冠军的姓名。
//
////select a.itemname,c.name, max(b.mark) from item as a where location = '游泳馆'
////        join grade as b on a.itemid = b.itemid
////        join sporter as c on b.id = c.sporterid
////group by b.itemid
//
//select max(sig.mark),sig.name,sig.itemname from
//        (select c.name,ig.itemname,ig.mark from sporter as c join
//            (select a.itemname, b.mark, b.id from item as a
//            join grade as b on a.itemid = b.itemid and a.location = '游泳馆') as ig
//            on c.sporterid = ig.id
//        ) as sig group by sig.itemid
