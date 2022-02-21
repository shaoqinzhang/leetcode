# 1. [Two Sum](https://leetcode.com/problems/two-sum/)
 set a hashmap like below:

> [![](https://static.wixstatic.com/media/d6c009_5d222ede0745481d961aa480955bf7c2~mv2.png/v1/fill/w_740,h_260,al_c,q_95/d6c009_5d222ede0745481d961aa480955bf7c2~mv2.webp)](https://www.code-recipe.com/post/two-sum) 

**Complexity Analysis**

Time Complexity: O(n)

Space Complexity: O(n)

# 2. [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)


Check if carry = 1, you should append a new node with carry to the end of the result list. 

**Complexity Analysis**

Time Complexity: O(max(m,n)), m is the size of L1, and n is the size of L2.

Space Complexity: O(max(m,n))

# 3. [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

using sliding window

**Complexity Analysis**

Time Complexity: O(n)

Space Complexity: O(k), k is the size of set.
# 56. [Merge Intervals](https://leetcode.com/problems/merge-intervals/)

tips: at first, you should sort the intervals by the first element.

**Complexity Analysis**

Time Complexity: O(nlogn), main time is sort time.

Space Complexity: O(logn), main space is sort space.

# 663. Equal Tree Partition

# 679. [24 Game](https://leetcode.com/problems/24-game/)

recursion solution

tips:use double type and use 1e-6 to judge same data.

**Complexity Analysis**

Time Complexity: O(1), total 4\*3*4\*3\*2\*4\*2\*1\*4= 9216

Space Complexity: O(1)


# 765. [Couples Holding Hands](https://leetcode.com/problems/couples-holding-hands/)

+ greedy

tips: patner is row[i]^1.

**Complexity Analysis**

Time Complexity: O(n^2)

Space Complexity: O(n)

+ [BFS](https://leetcode.com/problems/couples-holding-hands/discuss/1753082/C%2B%2B-O(n)-BFS-Approach-with-Detailed-Explanation-and-Diagram)

**Complexity Analysis**

Time Complexity: O(n)

Space Complexity: O(n)

+ [Union Find Solution](https://leetcode.com/problems/couples-holding-hands/discuss/1723790/Java-Union-Find-Solution)

**Complexity Analysis**

Time Complexity: O(nlogn)

Space Complexity: O(n)





