_Note: Chapter 2 is a harder version of this puzzle. The only difference is a larger constraint on *N*_ 

A photography set consists of *N* cells in a row, numbered from 1 to *N* in order, and can be represented by a string 
*C* of length *N*. Each cell *i* is one of the following types (indicated by *C<sub>i<sub>*, the *i*th character of *C*):

- If *C<sub>i<sub>* = “P”, it is allowed to contain a photographer
- If *C<sub>i<sub>* = “A”, it is allowed to contain an actor
- If *C<sub>i<sub>* = “B”, it is allowed to contain a backdrop
- If *C<sub>i<sub>* = “.”, it must be left empty

A *photograph* consists of a photographer, an actor, and a backdrop, such that each of them is placed in a valid cell, 
and such that the actor is between the photographer and the backdrop. Such a photograph is considered artistic if the 
distance between the photographer and the actor is between *X* and *Y* cells (inclusive), and the distance between the 
actor and the backdrop is also between *X* and *Y* cells (inclusive). The distance between cells *i* and *j* is ∣*i* − 
*j*∣ (the absolute value of the difference between their indices).

Determine the number of different artistic photographs which could potentially be taken at the set. Two photographs are 
considered different if they involve a different photographer cell, actor cell, and/or backdrop cell.

---

**Constraints**

1 ≤ *N* ≤ 200

1 ≤ *X* ≤ *Y* ≤ *N*

---

Sample test case #1
```
N = 5
C = APABA
X = 1
Y = 2
```
```
Expected Return Value = 1
```
---

Sample test case #2
```
N = 5
C = APABA
X = 2
Y = 3
```
```
Expected Return Value = 0
```
---

Sample test case #3
```
N = 8
C = .PBAAP.B
X = 1
Y = 3
```
```
Expected Return Value = 3
```
---

Sample Explanation

In the first case, the absolute distances between photographer/actor and actor/backdrop must be between 1 and 2. The 
only possible photograph that can be taken is with the 3 middle cells, and it happens to be artistic.
   
In the second case, the only possible photograph is again taken with the 3 middle cells. However, as the distance 
requirement is between 2 and 3, it is not possible to take an artistic photograph.
   
In the third case, there are 4 possible photographs, illustrated as follows:

```
.P.A...B
.P..A..B
..BA.P..
..B.AP..
```
All are artistic except the first, where the artist and backdrop exceed the maximum distance of 3

---
```java
// Write any import statements here

class Solution {
  
  public int getArtisticPhotographCount(int N, String C, int X, int Y) {
    // Write your code here
    return 0;
  }
  
}
```