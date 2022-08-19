package com.liufang.leecode.day20220818;

import com.liufang.leecode.day20220817.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
* @author hengliang.xu@patpat.com
* @decription
* @date 2022-08-18
 */
public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabckoiji"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 ) {
            return 0;
        }
        // 哈希集合，记录每个字符是否出现过
        Set<Character> characters = new HashSet<>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1;
        // 最终最长字串的大小
        int result = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                characters.remove(s.charAt(i - 1));
            }
            // 只要还没有超过原串的大小 且 没有出现重复字符
            while (rk + 1 < n && !characters.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                characters.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            result = Math.max(result, rk - i + 1);
        }
        return result;
    }

}
