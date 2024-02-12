You are the manager of a mail room which is frequently subject to theft. A period of *N* days is about to occur, such 
that on the *i*th day, the following sequence of events will occur in order:

1. A package with a value of *V<sub>i</sub>* dollars will get delivered to the mail room (unless *V<sub>i</sub>* = 0, in which case no package 
will get delivered).

2. You can choose to pay *C* dollars to enter the mail room and collect all of the packages there (removing them from 
the room), and then leave the room

3. With probability *S*, all packages currently in the mail room will get stolen (and therefore removed from the room).

Note that you're aware of the delivery schedule *V<sub>1..N</sub>*, but can only observe the state of the mail room when you choose 
to enter it, meaning that you won't immediately be aware of whether or not packages were stolen at the end of any given 
day.

Your profit after the *N*th day will be equal to the total value of all packages which you collected up to that point, 
minus the total amount of money you spent on entering the mail room.

Please determine the maximum expected profit you can achieve (in dollars).

Note: Your return value must have an absolute or relative error of at most 10<sup>−6</sup> to be considered correct.

---

**Constraints**

1 ≤ *N* ≤ 4,000

0 ≤ V*i* ≤ 1,000

1 ≤ *C* ≤ 1,000

0.0 ≤ *S* ≤ 1.0

---

Sample test case #1
```
N = 5
V = [10, 2, 8, 6, 4]
C = 5
S = 0.0
```
```
Expected Return Value = 25.00000000
```
---

Sample test case #2
```
N = 5
V = [10, 2, 8, 6, 4]
C = 5
S = 1.0
```
```
Expected Return Value = 9.00000000
```
---

Sample test case #3
```
N = 5
V = [10, 2, 8, 6, 4]
C = 3
S = 0.5
```
```
Expected Return Value = 17.00000000
```
---

Sample test case #4
```
N = 5
V = [10, 2, 8, 6, 4]
C = 3
S = 0.15
```
```
Expected Return Value = 20.10825000
```
---

Sample Explanation
In the first case, packages will never be stolen. You should therefore enter the mail room just once, on the final day, 
at which point there are sure to be 5 packages there with a total value of 10+2+8+6+4=30 dollars. Subtracting the 
5-dollar fee for entering the mail room, your profit is guaranteed to be 30−5=25 dollars.

In the second case, each package is sure to be stolen at the end of the day on which its delivered. You should enter the 
mail room on days 1, 3, and 4, each time collecting just the package delivered on that day. This yields a guaranteed 
profit of 10+8+6−(3∗5)=9 dollars.

In the third case, on each day, there's a 50% chance that all packages in the mail room will be stolen. You should enter 
the mail room on days 1, 3, 4, and 5. Note that, when you enter on day 3, there will be a 50% chance of the room having 
2 packages (with values of 2 and 8 dollars), and a 50% chance of the room having just 1 package (worth 8 dollars).

In the fourth case, you should only enter the mail room on days 1 and 5.

---
```java
// Write any import statements here

class Solution {
  
  public double getMaxExpectedProfit(int N, int[] V, int C, double S) {
    // Write your code here
    return 0.0;
  }
  
}
```