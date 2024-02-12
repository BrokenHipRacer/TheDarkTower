There are *N* warriors, the *i*th of which has a health of *H<sub>i</sub>* units and can deal *D<sub>i</sub>* units of 
damage per second. They are confronting a boss who has unlimited health and can deal *B* units of damage per second. 
Both the warriors and the boss deal damage continuously − for example, in half a second, the boss deals *B*/2 units of 
damage.

The warriors feel it would be unfair for many of them to fight the boss at once, so they'll select just two 
representatives to go into battle. One warrior *i* will be the front line, and a different warrior *j* will back them 
up. During the battle, the boss will attack warrior *i* until that warrior is defeated (that is, until the boss has 
dealt *H<sub>i</sub>* units of damage to them), and will then attack warrior *j* until that warrior is also defeated, at 
which point the battle will end. Along the way, each of the two warriors will do damage to the boss as long as they are 
undefeated.

Of course, the warriors will never prevail, but they'd like to determine the maximum amount of damage they could deal to 
the boss for any choice of warriors *i* and *j* before the battle ends.

_Note: Your return value must have an absolute or relative error of at most 10<sup>−6</sup> to be considered correct._

---

**Constraints**

2 ≤ *N* ≤ 500,000

1 ≤ *H<sub>i</sub>* ≤ 1,000,000,000

1 ≤ *D<sub>i</sub>* ≤ 1,000,000,000

1 ≤ *B* ≤ 1,000,000,000

---

Sample test case #1
```
N = 3
H = [2, 1, 4]
D = [3, 1, 2]
B = 4
```
```
Expected Return Value = 6.500000
```
---

Sample test case #2
```
N = 4
H = [1, 1, 2, 100]
D = [1, 2, 1, 3]
B = 8
```
```
Expected Return Value = 62.750000
```
---

Sample test case #3
```
N = 4
H = [1, 1, 2, 3]
D = [1, 2, 1, 100]
B = 8
```
```
Expected Return Value = 62.750000
```
---

Sample Explanation

In the first case, there are 3 warriors with healths of [2,1,4] units, and the ability to deal [3,1,2] units of damage 
respectively. The boss does *B* = 4 units of damage per second.

The optimal solution is to choose warrior 3 as the front line and warrior 1 as backup. Warrior 3 will be defeated after 
1 second, dealing 2 units of damage during this time (meanwhile, warrior 1 will have dealt 3 units of damage). Warrior 1 
will then step up and last for 0.5 seconds, while dealing another 1.5 units of damage along the way. The total damage 
dealt will then be 2+3+1.5=6.5 units.

In each of the second and third cases, it's possible for 62.75 units of damage to be dealt to the boss, though with 
different configurations of warriors.

---
```java
// Write any import statements here

class Solution {
  
  public double getMaxDamageDealt(int N, int[] H, int[] D, int B) {
    // Write your code here
    return 0.0;
  }
  
}
```