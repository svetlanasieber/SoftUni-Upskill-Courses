# Fishes Problem

## Problem Description

You're watching a beautiful river flow and notice plenty of fishes. The river flow splits into two parts:
- **Flow A**: Whirls any fish that enters so that the last fish to enter swims out first.
- **Flow B**: Follows a normal order where any fish swims through following the previous fishes.

You note each fish with its name and then a char: A or B. Your notes finish with "end" as the fish name. Your task is to read all the data about the fishes and output the two flows in the order in which the fishes will come out.

### Input

- Fish names followed by a character (A or B) indicating which flow they enter.
- Ends with the word "end".

### Output

- Print the fishes in **Flow A** in the order they will come out (last fish to enter comes out first).
- Print the fishes in **Flow B** in the order they will come out (first fish to enter comes out first).

### Examples

#### Example 1
**Input**

| Fish | Flow |
| --- | --- |
| Bass | A |
| Pike | B |
| Perch | A |
| Tuna | B |
| end |   |

**Output**

| Flow | Fishes |
| --- | --- |
| Flow A | Perch Bass |
| Flow B | Pike Tuna |

**Explanation**

Bass goes to flow A, Pike goes to flow B, Perch goes to flow A, and Tuna goes to flow B. The two flows contain:
- Flow A: Bass, Perch
- Flow B: Pike, Tuna

Flow A: The last fish to enter (Perch) comes out first.
Flow B: The fishes come out in the order they entered (Pike, Tuna).

#### Example 2
**Input**

| Fish | Flow |
| --- | --- |
| Goldfish | A |
| Trout | A |
| Catfish | A |
| end |   |

**Output**

| Flow | Fishes |
| --- | --- |
| Flow A | Catfish Trout Goldfish |
| Flow B | <EMPTY> |

**Explanation**

All fishes go to Flow A. The last fish to enter (Catfish) comes out first, followed by Trout and Goldfish. Flow B remains empty.

#### Example 3
**Input**

| Fish | Flow |
| --- | --- |
| Nemo | A |
| Dory | A |
| Marlin | B |
| Coral | A |
| Goldie | B |
| Bubbles | A |
| Finn | A |
| Splash | B |
| end |   |

**Output**

| Flow | Fishes |
| --- | --- |
| Flow A | Finn Bubbles Coral Dory Nemo |
| Flow B | Marlin Goldie Splash |

**Explanation**

Nemo, Dory, Coral, Bubbles, and Finn go to Flow A. Marlin, Goldie, and Splash go to Flow B.
- Flow A: The last fish to enter (Finn) comes out first, followed by Bubbles, Coral, Dory, and Nemo.
- Flow B: The fishes come out in the order they entered (Marlin, Goldie, Splash).


<img width="799" alt="fisher_example1" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/7fd1dd80-f0c1-4d4a-9407-668e782e942c">
