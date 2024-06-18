# Traffic Optimization Helper Program

## Problem Description

You're designing a smart traffic control system. To do so, you need to write a helper program. The goal of this program is to handle traffic data between two to twenty-six intersections named from A to Z.

### Input

1. The first parameter is an integer number indicating the number of intersections.
   - Example: 3 means that the intersections are from A to C.
2. The second part of the input data is the distance between each of the intersections. The distance is always a single digit from 1 to 9, represented in a matrix form.

#### Example Matrix Input

For 3 intersections:
0 3 4
3 0 1
6 2 0


This matrix represents the distances:
- A to B: 3, B to A: 3
- A to C: 4, C to A: 6
- B to C: 1, C to B: 2

### Tasks

1. **Read and Print Matrix**: Read the matrix input and print it with row descriptions and column titles.
2. **Analyze for Optimization Opportunities**: Identify and print all optimization opportunities where there is a difference between the roads of two points.
   - Example output for above matrix:
     ```
     AC(4) - CA(6)
     BC(1) - CB(2)
     ```
3. **Calculate and Print Total Optimization Opportunities**: Sum the absolute differences of all optimization opportunities.
   - Example output:
     ```
     Total opportunities: 3
     ```
4. **Determine and Print Maximum Optimization Opportunity**: Identify the largest optimization opportunity and print it. If there are multiple, print all of them comma-separated.
   - Example output:
     ```
     Max optimization: 2: AC-CA
     ```

### Examples

#### Example 1
**Input**
3
0 3 4
3 0 1
6 2 0


**Output**

 A B C
 A 0 3 4
 B 3 0 1
 C 6 2 0

 AC(4) - CA(6)
 BC(1) - CB(2)

 Total opportunities: 3
 Max optimization: 2: AC-CA


#### Example 2
**Input**
4
0 3 5 1
1 0 4 6
7 3 0 1
4 3 4 0


**Output**
A B C D
A 0 3 5 1
B 1 0 4 6
C 7 3 0 1
D 4 3 4 0

AB(3) - BA(1)
AC(5) - CA(7)
AD(1) - DA(4)
BC(4) - CB(3)
BD(6) - DB(3)
CD(1) - DC(4)

Total opportunities: 14
Max optimization: 3: AD-DA BD-DB CD-DC


#### Example 3
**Input**
5
0 3 4 7 9
3 0 1 3 1
4 1 0 4 2
7 3 4 0 5
9 1 2 5 0


**Output**
A B C D E
A 0 3 4 7 9
B 3 0 1 3 1
C 4 1 0 4 2
D 7 3 4 0 5
E 9 1 2 5 0

Total opportunities: 0
Max optimization: none





