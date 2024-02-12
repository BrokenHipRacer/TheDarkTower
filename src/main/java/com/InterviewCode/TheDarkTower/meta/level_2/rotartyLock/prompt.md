*Note: Chapter 1 is an easier version of this puzzle.*

You're trying to open a lock. The lock comes with two wheels, each of which has the integers from *1* to *N* arranged in 
a circle in order around it (with integers *1* and *N* adjacent to one another). Each wheel is initially pointing at *1*.

For example, the following depicts the lock for *N* = 10 (as is presented in the second sample case).

It takes 1 second to rotate a wheel by 1 unit to an adjacent integer in either direction, and it takes no time to select 
an integer once a wheel is pointing at it.

The lock will open if you enter a certain code. The code consists of a sequence of *M* integers, the *i*th of which is 
*C<sub>i</sub>*. For each integer in the sequence, you may select it with either of the two wheels. Determine the 
minimum number of seconds required to select all *M* of the code's integers in order.

---

**Constraints**

3 ≤ *N* ≤ 1,000,000,000

1 ≤ *M* ≤ 3,000

1 ≤ *C<sub>i</sub>* ≤ *N*

---

Sample test case #1
```
N = 3
M = 3
C = [1, 2, 3]
```
```
Expected Return Value = 2
```
---

Sample test case #2
```
N = 10
M = 4
C = [9, 4, 4, 8]
```
```
Expected Return Value = 6
```
---

Sample Explanation

In the first case, there are 3 integers on the locks, and the sequence of integers to be selected is [1,2,3]. One 
optimal way to enter the code is: select 1 on the first lock → rotate the first lock to 2 (1 second) → select 2 → rotate 
the second lock from 1 backwards to 3 (1 second) → select 3. The total time taken is 1+1=2 seconds.

In the second case, the locks each consists of the integers 1 through 10, and the sequence to be selected is [9,4,4,8]. 
One optimal way to enter the code is: rotate the first lock from 1 backwards to 9 (2 seconds) → select 9 → rotate the 
second lock forwards from 1 to 4 (3 seconds) → select 4 twice → rotate the first lock from 9 backwards to 8 (1 second) →  
select 8. The total time taken is 2+3+1=6 seconds.

---
```java
// Write any import statements here

class Solution {
  
  public long getMinCodeEntryTime(int N, int M, int[] C) {
    // Write your code here
    return 0L;
  }
  
}
```