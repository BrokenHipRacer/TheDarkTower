_Note: Chapter 2 is a harder version of this puzzle. The only difference is a larger set of possible problem point values._

You are spectating a programming contest with *N* competitors, each trying to independently solve the same set of 
programming problems. Each problem has a point value, which is **either 1 or 2**.

On the scoreboard, you observe that the *i*th competitor has attained a score of *S<sub>i</sub>*, which is a positive integer equal 
to the sum of the point values of all the problems they have solved.

The scoreboard does not display the number of problems in the contest, nor their point values. Using the information 
available, you would like to determine the minimum possible number of problems in the contest.

---

Constraints

1 ≤ *N* ≤ 500,000

1 ≤ *S<sub>i</sub>* ≤ 1,000,000,000

---

Sample test case #1
```
N = 6
S = [1, 2, 3, 4, 5, 6]
```
```
Expected Return Value = 4
```
---

Sample test case #2
```
N = 4
S = [4, 3, 3, 4]
```
```
Expected Return Value = 3
```
---

Sample test case #3
```
N = 4
S = [2, 4, 6, 8]
```
```
Expected Return Value = 4
```
---

Sample Explanation

In the first case, it's possible that there are as few as 4 problems in the contest, for example with point values 
[1,1,2,2]. The 6 competitors could have solved the following subsets of problems:
1. Problem 1 (1 point)
2. Problem 3 (2 points)
3. Problems 2 and 3 (1+2=3 points)
4. Problems 1, 2, and 4 (1+1+2=4 points)
5. Problems 2, 3, and 4 (1+2+2=5 points)
6. All 4 problems (1+1+2+2=6 points)

It is impossible for all 6 competitors to have achieved their scores if there are fewer than 4 problems.

In the second case, one optimal set of point values is [1,1,2].

In the third case, one optimal set of point values is [2,2,2,2].

---

```java
// Write any import statements here

class Solution {
  
  public int getMinProblemCount(int N, int[] S) {
    // Write your code here
    return 0;
  }
  
}
```