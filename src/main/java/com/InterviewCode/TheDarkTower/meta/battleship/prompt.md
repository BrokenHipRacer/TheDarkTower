You're playing Battleship on a grid of cells with *R* rows and *C* columns. There are 0 or more battleships on the grid,
each occupying a single distinct cell. The cell in the *i*th row from the top and *j*th column from the left either 
contains a battleship (G*i,j*=1) or doesn't (G*i,j*=0)4.

You're going to fire a single shot at a random cell in the grid. You'll choose this cell uniformly at random from the 
*R*∗*C* possible cells. You're interested in the probability that the cell hit by your shot contains a battleship.

Your task is to implement the function getHitProbability(R, C, G) which returns this probability.

Note: Your return value must have an absolute or relative error of at most 10^−6 to be considered correct.

---

**Constraints**

1 ≤ *R*,*C* ≤ 100

0 ≤ G*i,j* ≤ 1

---

Sample test case #1

R = 2

C = 3

G = 

0 0 1 

1 0 1

Expected Return Value = 0.50000000

---

Sample test case #2

R = 2

C = 2

G = 

1 1

1 1

Expected Return Value = 1.00000000

---

Sample Explanation

In the first case, 3 of the 6 cells in the grid contain battleships. Therefore, the probability that your shot will hit
one of them is 3/6=0.5.

In the second case, all 4 cells contain battleships, resulting in a probability of 1.0 of hitting a battleship.

---
// Write any import statements here

class Solution {

public double getHitProbability(int R, int C, int[][] G) {

// Write your code here

return 0.0;

}

}
