# Offroad Challenge

John is quite an avid off-road fan. He bought a new jeep and made the necessary improvements to it. John is ready for new off-road adventures and can't wait to get started. In this challenge, he must save his fuel very carefully…

There will be two sequences of integers. The first sequence will represent the initial fuel and the second - additional consumption index due to thin air at high altitudes, hence higher fuel consumption. There will also be a third sequence of integers, representing values equal to the necessary amount of fuel needed to reach the corresponding altitude in the challenge.

## Task

Your task is to take the last fuel quantity from the fuel sequence and the first index from the additional consumption index sequence. Subtract the values and check the result.

- The corresponding altitude is reached if the calculated result is bigger or equal to the first element from the needed amount of fuel sequence. You need to remove both the fuel and the consumption index from their sequences as well as the needed amount of fuel index from their sequence.
- If the calculated result is smaller or not equal to the first element from the needed amount of fuel sequence, the corresponding altitude is not reached, movement cannot continue, and the program should end.

## Input

- The first line will represent the initial fuel – integers, separated by a single space.
- The second line will represent the consumption indexes that decrease initial fuel – integers, separated by a single space.
- The third line will represent the quantities needed to reach the corresponding altitude – integers, separated by a single space.

## Output

- On the first or the next n lines, output the corresponding message on the console from the following options:
  - If John reaches the altitude, print the message:
    - `John has reached: Altitude 1`
    - …
    - `John has reached: Altitude {n}`
  - If John fails to reach the altitude, print the message:
    - `John did not reach: Altitude {n}`
- On the next lines, based on whether he reached the top or not, print the following on the console in the specified format:
  - If John doesn't have enough fuel to reach the top but has reached some altitude, display the following messages:
    - `John failed to reach the top.`
    - `Reached altitudes: Altitude 1, … Altitude {n}`
  - If John does not have enough fuel to reach the top and has not reached any altitude, print:
    - `John failed to reach the top.`
    - `John didn't reach any altitude.`
  - If John manages to reach all the altitudes, he will reach the top. End the program and print on the console the following message:
    - `John has reached all the altitudes and managed to reach the top!`

## Constraints

- All the given numbers will be valid integers in the range [1, 200].
- All sequences always consist of four elements.
- There will be no negative input.
<img width="342" alt="2024-06-14 00_03_01-Exam-Preparation-13-Jun-2024 - Word" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/b72ffde6-6d13-464d-80a7-766ba62ef53a">
