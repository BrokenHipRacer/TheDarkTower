A family of frogs in a pond are traveling towards dry land to hibernate. They hope to do so by hopping across a trail of
*N* lily pads, numbered from 1 to *N* in order.

There are *F* frogs, numbered from 1 to *F*. Frog *i* is currently perched atop lily pad *P<sub>i</sub>*. No two frogs are 
currently on the same lily pad. Lily pad *N* is right next to the shore, and none of the frogs are initially on lily pad 
*N*. 

Each second, one frog may hop along the trail towards lily pad *N*. When a frog hops, it moves to the nearest lily pad 
after its current lily pad which is not currently occupied by another frog (hopping over any other frogs on intermediate 
lily pads along the way). If this causes it to reach lily pad *N*, it will immediately exit onto the shore. Multiple 
frogs may not simultaneously hop during the same second. 

Assuming the frogs work together optimally when deciding which frog should hop during each second, determine the minimum 
number of seconds required for all *F* of them to reach the shore.

---

**Constraints**

2 ≤ *N* ≤ 10<sup>12</sup>

1 ≤ *F* ≤ 500,000

1 ≤ *P<sub>i</sub>* ≤ *N* − 1

---

Sample test case #1
```
N = 3
F = 1
P = [1]
```
```
Expected Return Value = 2
```
---

Sample test case #2
```
N = 6
F = 3
P = [5, 2, 4]
```
```
Expected Return Value = 4
```
---

Sample Explanation

In the first case, there are 3 lily pads and 1 frog. The frog is initially atop lily pad 1 and will take 2 hops to reach 
lily pad 3.

In the second case, there are 6 lily pads, with frogs on lily pads 5, 2, and 4. Initially the lily pads and frog numbers 
can be represented as .2.31. 

One optimal sequence of hops is: 
1. Frog 2 hops forward to lily pad 3:
```..231.```

2. Frog 2 hops over frogs 1 and 3, onto lily pad 6 and exiting onto the shore:
```...31.```

3. Frog 3 hops over frog 1, onto lily pad 6 and exiting onto the shore:
```....1.```

4. Frog 1 hops onto lily pad 6, exiting onto the shore.

---
```java
// Write any import statements here

class Solution {
  
  public long getSecondsRequired(long N, int F, long[] P) {
    // Write your code here
    return 0L;
  }
  
}
```