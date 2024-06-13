# The Gambler

You will be given an integer `n` for the size of the game board (square shape). On the next `n` lines, you will receive the rows of the board. The gambler will start at a random position, marked with the letter 'G' and have an initial 'entering the game' amount of 100$.

On each turn, until the command 'end' is received, you will receive commands for the direction in which the gambler should move. The commands will be "up", "down", "left", and "right".

- If a position with '-' (dash) is reached, it means that the field is empty and the gambler awaits its next direction.
- If the position marked with the letter 'W' is reached, the gambler takes it and adds 100$ to his amount.
- If the position marked with the letter 'P' (penalty) is reached, decrease the gambler's total amount by 200$.
- If the position marked with the letter 'J' is reached, the gambler wins the jackpot, adds 100000$ to his amount, and the game ends.
- If the gambler leaves the boundaries of the board or his total amount becomes equal to or drops below 0 (zero), he loses everything, and you should stop the program.

The current gambler position should be marked with 'G'. When the gambler leaves a position marked with a letter, it should be replaced by '-' (dash).

The program ends when one of these four events occurs:
- the gambler leaves the board boundaries
- command 'end' is received
- the gambler's total winning amount is equal to or drops below 0 (zero)
- the position marked with 'J' is reached

## Input

- On the first line, you are given the integer `n` – the size of the matrix (board).
- The next `n` lines hold the values for every row.
- On each of the next lines, you will get a direction command.

## Output

- If you win the jackpot on the first and second lines, print:
  - `You win the Jackpot!`
  - `End of the game. Total amount: {amount}$`
- If you do not win the jackpot, print:
  - `End of the game. Total amount: {amount}$`
- If you leave the boundaries of the matrix or the gambler's amount becomes 0 (zero) or below, print:
  - `Game over! You lost everything!`

## Constraints

- The square matrix (board) size will be between [4…10].
- Gambler's starting position will always be marked with 'G'.
- There will always be a field marked with 'W' and it may appear more than once.
- There will always be one field marked with 'J'.
- There will always be one or two fields marked with 'P'.
- You will always receive enough commands to end the game.
- Finally, if you have any amount left, print the matrix.
  
<img width="372" alt="2" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/c1044e21-26f4-4c6a-a5f7-73d0b0e492e5">
