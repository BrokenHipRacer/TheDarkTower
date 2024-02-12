_Note: Chapter 1 is an easier version of this puzzle._

There's a stack of *N* inflatable discs, with the *i*th disc from the top having an initial radius of *R<sub>i</sub>* 
inches.

The stack is considered unstable if it includes at least one disc whose radius is larger than or equal to that of the 
disc directly under it. In other words, for the stack to be stable, each disc must have a strictly smaller radius than 
that of the disc directly under it.

As long as the stack is unstable, you can repeatedly choose a disc and perform one of the following operations:
- Inflate the disc, increasing its radius by 1 inch. This operation takes *A* seconds and may be performed on discs of 
any radius (even those that exceed 10<sup>9</sup> inches).
- Deflate the disc, decreasing its radius by 1 inch. This operation takes *B* seconds and may only be performed if the 
resulting radius is a positive integer number of inches (that is, if the disc has a radius of at least 2" before being 
deflated).

Determine the minimum number of seconds needed in order to make the stack stable.

---

**Constraints**

1 ≤ *N* ≤ 50

1 ≤ *R<sub>i</sub>* ≤ 1,000,000,000

1 ≤ *A*, *B* ≤ 100

---

Sample test case #1
```
N = 5
R = [2, 5, 3, 6, 5]
A = 1
B = 1
```
```
Expected Return Value = 5
```
---

Sample test case #2
```
N = 3
R = [100, 100, 100]
A = 2
B = 3
```
```
Expected Return Value = 5
```
---

Sample test case #3
```
N = 3
R = [100, 100, 100]
A = 7
B = 3
```
```
Expected Return Value = 9
```
---

Sample test case #4
```
N = 4
R = [6, 5, 4, 3]
A = 10
B = 1
```
```
Expected Return Value = 19
```
---

Sample test case #5
```
N = 4
R = [100, 100, 1, 1]
A = 2
B = 1
```
```
Expected Return Value = 207
```
---

Sample test case #6
```
N = 6
R = [6, 5, 2, 4, 4, 7]
A = 1
B = 1
```
```
Expected Return Value = 10
```
---

Sample Explanation

In the first case, the discs (from top to bottom) have radii of [2",5",3",6",5"]. It takes  *A* = *B* = 1 second to 
inflate or deflate a disc radius by 1". One optimal way to stabilize the stack is by deflating disc 2 from 5" to 3" 
(taking 2 seconds), inflating disc 3 from 3" to 4" (taking 1 second), deflating disc 4 from 6" to 5" (taking 1 second), 
and inflating disc 5 from 5" to 6" (taking 1 second). This yields final radii of [2",3",4",5",6"], taking a total of 2 + 
1 + 1 + 1 = 5 seconds.

In the second case, it takes *A* = 2 seconds to inflate a disc by 1", and *B* = 3 seconds to deflate a disc by 1". One 
optimal way to stabilize the stack is by deflating disc 1 from 100" to 99" (taking 3 seconds) and inflating disc 3 from 
100" to 101" (taking 2 seconds), for a total of 5 seconds.

In the third case, an optimal stabilization strategy is to deflate the first two discs to 98" and 99" respectively, 
taking 2∗3+1∗3=9 seconds.

In the fourth case, an optimal stabilization strategy is to arrive at disc radii [1",2",3",4"] in (6−1)∗1+(5−2)∗1+(4−3)∗
1+(4−3)∗10=19 seconds.

In the fifth case, it's possible to stabilize the stack in 207 seconds.

In the sixth case, it's possible to stabilize the stack in 10 seconds.

---
```java
// Write any import statements here

class Solution {
  
  public long getMinimumSecondsRequired(int N, int[] R, int A, int B) {
    // Write your code here
    return 0L;
  }
  
}
```