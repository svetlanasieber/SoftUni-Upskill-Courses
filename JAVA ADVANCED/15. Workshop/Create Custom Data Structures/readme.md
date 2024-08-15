# Workshop: Custom Data Structures

This document defines the lab for the "Java Advanced" course @ Software University.

## Overview

In this workshop, we will create our own custom data structures – a custom list (`SmartArray`) and a custom stack. The `SmartArray` will have similar functionality to the Java `ArrayList` that you've used before. Our `SmartArray` will work only with integers for now, but after the Generics lecture from this course, you can try to change that and make the structure generic, allowing it to work with any type.

### SmartArray Functionality

- `void add(int element)` - Adds the given element to the end of the list.
- `int get(int index)` - Returns the element at the specified position in this list.
- `int remove(int index)` - Removes the element at the given index.
- `boolean contains(int element)` - Checks if the list contains the given element, returns `true` or `false`.
- `void add(int index, int element)` - Adds an element at the specific index, shifting subsequent elements to the right and increasing the size.
- `void forEach(Consumer<Integer> consumer)` - Iterates through each of the elements in the list.

### CustomStack Functionality

- `void push(int element)` – Adds the given element to the stack.
- `int pop()` – Removes and returns the last added element.
- `int peek()` – Returns the last element in the stack without removing it.
- `void forEach(Consumer<Integer> consumer)` – Iterates through each of the elements in the stack.

## Implementing the SmartArray Class

### Structure Details

- **Internal Array**: The `SmartArray` should hold a sequence of items in an array.
- **Dynamic Capacity**: The array should have a capacity that grows twice when filled, starting with a capacity of 4.

### Fields

- `int[] data` - An array that holds all of our elements.
- `int size` – The number of elements currently in the array.
- `int capacity` – The current capacity of the array.

### Internal Methods

- `void resize()` - Increases the internal array's length by doubling it.
- `void shrink()` - Decreases the internal array's length by halving it.
- `void shiftLeft(int index)` - Shifts elements left after removing an element.
- `void shiftRight(int index)` - Shifts elements right when inserting an element.

### Implementation Guide

1. **Initialize Fields**:
   - Create the `SmartArray` class and add a private static constant `INITIAL_CAPACITY` set to 4.
   - Initialize the `data` array and `size` in the constructor.

2. **Add Method**:
   - Implement the `void add(int element)` method. Resize the array if necessary, then add the element.

3. **Get Method**:
   - Implement the `int get(int index)` method. Validate the index and return the element at that index.

4. **Remove Method**:
   - Implement the `int remove(int index)` method. Validate the index, remove the element, shift elements left, and resize if necessary.

5. **Insert Method**:
   - Implement the `void add(int index, int element)` method. Validate the index, shift elements right, and add the element.

6. **Contains Method**:
   - Implement the `boolean contains(int element)` method. Iterate through elements and check if the element exists.

7. **ForEach Method**:
   - Implement the `void forEach(Consumer<Integer> consumer)` method. Iterate through each element and apply the given consumer action.

## Implementing the CustomStack Class

### Structure Details

- **Internal Array**: The `CustomStack` should hold a sequence of items in an array.
- **Dynamic Capacity**: The array should have a capacity that grows twice when filled, starting at 4.

### Fields

- `int[] items` - An array that holds all of our elements.
- `int size` – The number of elements currently in the stack.
- `final int initialCapacity` – The initial capacity of the internal array.

### Implementation Guide

1. **Initialize Fields**:
   - Create the `CustomStack` class and initialize the `items` array with the `initialCapacity`.

2. **Push Method**:
   - Implement the `void push(int element)` method. Add the element to the top of the stack, resizing if necessary.

3. **Pop Method**:
   - Implement the `int pop()` method. Remove and return the last element, ensuring the stack is not empty.

4. **Peek Method**:
   - Implement the `int peek()` method. Return the last element without removing it, ensuring the stack is not empty.

5. **ForEach Method**:
   - Implement the `void forEach(Consumer<Integer> consumer)` method. Iterate through each element and apply the given consumer action.

## Conclusion

Feel free to add additional methods that you find useful or interesting. After completing the implementation, you can test your classes in the `main()` method to ensure everything works as expected.

> "Imagination will often carry us to worlds that never were, but without it, we go nowhere."  
> — Carl Sagan
