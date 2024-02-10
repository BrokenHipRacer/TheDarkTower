There's a multiple-choice test with N questions, numbered from 1 to N. Each question has 2 answer options, labelled A 
and B. You know that the correct answer for the *i*th question is the *i*th character in the string C, which is either 
"A" or "B", but you want to get a score of 0 on this test by answering every question incorrectly.

Your task is to implement the function getWrongAnswers(N, C) which returns a string with N characters, the *i*th of 
which is the answer you should give for question i in order to get it wrong (either "A" or "B").

---

**Constraints**

1≤N≤100

C*i* ∈ { ‘‘A", ‘‘B" }

---

Sample test case #1

N = 3

C = ABA

Expected Return Value = BAB

---

Sample test case #2

N = 5

C = BBBBB

Expected Return Value = AAAAA

---

Sample Explanation

In the first case the correct answers to the 3 questions are A, B, and A, in that order. Therefore, in order to get them
all wrong, the 3 answers you should give are B, A, and B, in that order.

In the second case the correct answers are all B, so you should answer each question with A.

---
// Write any import statements here

class Solution {

public String getWrongAnswers(int N, String C) {

// Write your code here

return "";

}

}
