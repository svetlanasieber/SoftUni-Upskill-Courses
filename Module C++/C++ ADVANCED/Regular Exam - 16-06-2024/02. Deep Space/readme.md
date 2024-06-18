# Deep Space Problem

## Problem Description

You're a space observer in a deep space station called Deep Space One. As such, you receive data from complex equipment that scans the space and detects various objects.

### Input

The input is presented in a matrix where every element represents part of the visible field. The matrix is defined by several strings consisting of a combination of the characters below until you read the word "end":

- Uppercase letters: `O B A F G K M L T Y` (representing star types)
- Digits `1..9` (representing the number of planets in a segment)
- `#` (representing expected asteroids)
- `$` (representing expected comets)
- `.` (representing empty segments)

Immediately after the "end" there will be a single word consisting of one or more characters from above. Each character from this word indicates the characters in the matrix that must be replaced with `+`.

### Output

The final output must include:

1. **Total number of stars detected in the initial matrix**, followed by the number of stars for each type in alphabetical order.
2. **Total number of planets detected** in the initial matrix.
3. **Total number of asteroids and comets** from the initial matrix.
4. **The new matrix** after applying the replacement.

### Hints

- The input is guaranteed to be correct.
- Sum the number of planets in each segment (e.g., segments `1` and `9` result in a total of `10` planets).

### Examples

#### Example 1
**Input**

| Matrix | Replacement Word |
| --- | --- |
| O.B.G | OB$ |
| 1#A.9 |   |
| K$M.T |   |
| end |   |

**Output**

| Description | Result |
| --- | --- |
| Stars | 7 |
|   | - A: 1 |
|   | - B: 1 |
|   | - G: 1 |
|   | - K: 1 |
|   | - M: 1 |
|   | - O: 1 |
|   | - T: 1 |
| Planets | 10 |
| Asteroids/comets | 2 |
| New Matrix | +.+.G <br> 1#A.9 <br> K+M.T |

#### Example 2
**Input**

| Matrix | Replacement Word |
| --- | --- |
| OB..G | A |
| .#A#9 |   |
| K$..T |   |
| end |   |

**Output**

| Description | Result |
| --- | --- |
| Stars | 6 |
|   | - A: 1 |
|   | - B: 1 |
|   | - G: 1 |
|   | - K: 1 |
|   | - O: 1 |
|   | - T: 1 |
| Planets | 9 |
| Asteroids/comets | 3 |
| New Matrix | OB..G <br> .#+#9 <br> K$..T |

#### Example 3
**Input**

| Matrix | Replacement Word |
| --- | --- |
| ....... | A |
| ....... |   |
| ....... |   |
| end |   |

**Output**

| Description | Result |
| --- | --- |
| Stars | 0 |
| Planets | 0 |
| Asteroids/comets | 0 |
| New Matrix | ....... <br> ....... <br> ....... |


