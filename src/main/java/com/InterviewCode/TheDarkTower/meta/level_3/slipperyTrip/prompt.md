There's a grid of cells with *R* rows (numbered from 1 to *R* from top to bottom) and *C* columns (numbered from 1 to 
*C* from left to right). The grid wraps around horizontally, meaning that column 1 is just to the right of column *C* (
and column *C* is just to the left of column 1).

The cell in row *i* and column *j* initially contains one of the following (indicated by the character *G<sub>i,j</sub>*
):

- If *G<sub>i,j</sub>* = ".", the cell is empty.
- If *G<sub>i,j</sub>* = "*", the cell contains a coin.
- If *G<sub>i,j</sub>* = ">", the cell contains an arrow pointing right.
- If *G<sub>i,j</sub>* = "v", the cell contains an arrow pointing down.

You may cyclically shift each row to the right as many times as you'd like (including not at all). Each such shift 
causes each of the row's cells to move 1 column to the right, with its rightmost cell (in column *C*) wrapping around 
and moving to column 1.

After you've finished rotating the rows to your liking, you'll take a trip through the grid, starting by entering the 
cell at the top-left corner (in row 1 and column 1 downward from above the grid. Upon entering a cell, if it contains a 
coin that you haven't yet collected, you'll collect it. If it contains an arrow, your direction of travel will change to 
that of the arrow (either right or down). Either way, you'll then proceed to the next adjacent cell in your direction of 
travel. If you move rightward from column *C*, you'll wrap around to column 1 in the same row, and if you move downward 
from row *R*, you'll end your trip. Note that you may only collect each cell's coin at most once, that your trip might 
last forever, and that once you begin your trip you cannot shift the grid's rows further.
   
Determine the maximum number of coins you can collect on your trip.
   
---

**Constraints**

2 ≤ *R*, *C* ≤ 400,000

*R ∗ C* ≤ 800,000

*G<sub>i,j</sub>* ∈ {".", "*", ">", "v"}

---
 
Sample test case #1
```
R = 3
C = 4
G = .***
    **v>
    .*..
```
```
Expected Return Value = 4
```
---

Sample test case #2
```   
R = 3
C = 3
G = >**
    *>*
    **>
```
```
Expected Return Value = 4
```
---

Sample test case #3 
```
R = 2
C = 2
G = >>
    **
```
```
Expected Return Value = 0
```
---

Sample test case #4 
```
R = 4
C = 6
G = >*v*>*
    *v*v>*
    .*>..*
    .*..*v
```
```
Expected Return Value = 6
```
---

Sample Explanation

The first case is depicted below:

To collect the maximum number of coins, the grid can be rotated as follows, and traversed with the highlighted path 
(1,1) → (2,1) → (2,2) → (2,3) → (2,4) → (3,4), ultimately ending the trip:

The second case is depicted below:

To collect the maximum number of coins, the grid can be rotated as follows, and traversed with the highlighted path 
(1,1) → (2,1) → (3,1) → (3,2) → (3,3) → (3,1) → ..., at which point you'll loop around row 3 indefinitely:

In the third case, you cannot collect any coins.

In the fourth case, you can collect at most 6 coins.

---
```java
// Write any import statements here

class Solution {
  
  public int getMaxCollectableCoins(int R, int C, char[][] G) {
    // Write your code here
    return 0;
  }
  
}
```