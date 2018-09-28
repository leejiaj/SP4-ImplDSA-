CS 5V81 SP 4: Binary search trees

Priyanka Awaraddi and Leejia James

How to Compile:
1. Unzip contents of pxa172130.zip into a folder named "pxa172130".
2. Run the command `javac pxa172130/*.java` to compile.

How to Run:
3. Run the command `java pxa172130.Driver` to execute the driver.
4. Print messages are given as how to run the program.

OR

3. Run the command `java pxa172130.BinarySearchTree` to execute the program.
4. Sample input and output are as follows.

Sample input:
1 3 5 7 9 2 4 6 8 10 -3 -6 -3 0

Output:
Add 1 : [1] 1
Add 3 : [2] 1 3
Add 5 : [3] 1 3 5
Add 7 : [4] 1 3 5 7
Add 9 : [5] 1 3 5 7 9
Add 2 : [6] 1 2 3 5 7 9
Add 4 : [7] 1 2 3 4 5 7 9
Add 6 : [8] 1 2 3 4 5 6 7 9
Add 8 : [9] 1 2 3 4 5 6 7 8 9
Add 10 : [10] 1 2 3 4 5 6 7 8 9 10
Remove -3 : [9] 1 2 4 5 6 7 8 9 10
Remove -6 : [8] 1 2 4 5 7 8 9 10
Remove -3 : [8] 1 2 4 5 7 8 9 10
Final: 1 2 4 5 7 8 9 10 