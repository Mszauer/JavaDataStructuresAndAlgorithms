# Quick-Find
Implemented with an array id[] of size N
Interpretation: p and q are connect if, and only if, they have the same id

Time Complexities:
|  Algorithm  |   intialize   | union | find  |
|  ---------- | ------------- | ----- | ----- |
| quick find  |  	O(N) 	  |  O(N) | O(1)  |


Takes *N^2* array accesses (quadratic time, *O(N^2)* ) to process a sequence of *N* union commands on *N* objects.
