_Note: Chapter 1 is an easier version of this problem._

You're having a grand old time clicking through the rabbit hole that is your favorite online encyclopedia.

The encyclopedia consists of *N* different web pages, numbered from 1 to *N*. There are *M* links present across the 
pages, the *i*th of which is present on page *A<sub>i</sub>* and links to a different page *B<sub>i</sub>*. A page may 
include multiple links, including multiple leading to the same other page.

A session spent on this website involves beginning on one of the *N* pages, and then navigating around using the links 
until you decide to stop. That is, while on page *i*, you may either move to any of the pages linked to from it, or stop 
your browsing session.

Assuming you can choose which page you begin the session on, what's the maximum number of different pages you can visit 
in a single session? Note that a page only counts once even if visited multiple times during the session.

---

**Constraints**

2 ≤ *N* ≤ 500,000

1 ≤ *M* ≤ 500,000

1 ≤ *A<sub>i</sub>*, *B<sub>i</sub>* ≤ *N*

*A<sub>i</sub>* ≠ *B<sub>i</sub>*

---

Sample test case #1
```
N = 4
M = 4
A = [1, 2, 3, 4]
B = [4, 1, 2, 1]
```
```
Expected Return Value = 4
```
---

Sample test case #2
```
N = 5
M = 6
A = [3, 5, 3, 1, 3, 2]
B = [2, 1, 2, 4, 5, 4]
```
```
Expected Return Value = 4
```
---

Sample test case #3
```
N = 10
M = 9
A = [3, 2, 5, 9, 10, 3, 3, 9, 4]
B = [9, 5, 7, 8, 6, 4, 5, 3, 9]
```
```
Expected Return Value = 5
```
---

Sample Explanation

In the first case, the maximum number of different pages which you can visit in a single browsing session is 4. For 
example, you can visit the sequence of pages 3 → 2 → 1 → 4.

In the second case, you can only visit at most 4 different pages − for example, the sequence of pages 3 → 5 → 1 → 4. 

In the third case, you can only visit at most 5 different pages − for example, the sequence of pages 3 → 4 → 9 → 3 → 5 → 
7 (note that page 3 only counts once).

---
```java
// Write any import statements here

class Solution {
  
  public int getMaxVisitableWebpages(int N, int M, int[] A, int[] B) {
    // Write your code here
    return 0;
  }
  
}
```