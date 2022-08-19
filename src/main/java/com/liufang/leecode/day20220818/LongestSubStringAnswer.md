
### 解题思路 
这一题和第 438 题，第 3 题，第 76 题，第 567 题类似，用的思想都是"滑动窗口”。

滑动窗口的右边界不断的右移，只要没有重复的字符，就持续向右扩大窗口边界。一旦出现了重复字符，就需要缩小左边界，直到重复的字符移出了左边界，然后继续移动滑动窗口的右边界。以此类推，每次移动需要计算当前长度，并判断是否需要更新最大长度，最终最大的值就是题目中的所求。

---
### 复杂度分析
时间复杂度 O(max(m,n)) 假设m,n分别为l1,l2的长度，算法最多重复，max(m,n)
空间复杂度 O(max(m,n)) 新列表的长度最大为 max(m,n) + 1