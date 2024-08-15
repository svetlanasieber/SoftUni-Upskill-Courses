
# Create Custom Data Structures

Problems for the "C# Advanced" course @ Software University

## Overview

In this workshop, we will create our own custom data structures – a custom list, a custom stack, and a custom queue. The custom list will have similar functionality to C# lists that you've used before. Our custom list will work only with integers for now, but this will be fixed later in the course. It will have the following functionality:

- `void Add(int element)` – Adds the given element to the end of the list.
- `int RemoveAt(int index)` – Removes the element at the given index.
- `bool Contains(int element)` – Checks if the list contains the given element, returns `true` or `false`.
- `void Swap(int firstIndex, int secondIndex)` – Swaps the elements at the given indexes.

Feel free to implement your functionality or to write the methods by yourself.

The custom stack will also have similar functionality to the C# stack, and again, we will make it work only with integers. Later on, we will learn how to implement it in a way that will allow us to work with any type. It will have the following functionality:

- `void Push(int element)` – Adds the given element to the stack.
- `int Pop()` – Removes the last added element.
- `int Peek()` – Returns the last element in the stack without removing it.
- `void ForEach(Action<int> action)` – Goes through each of the elements in the stack.

Feel free to implement your functionality or to write the methods by yourself.

The custom queue will also have similar functionality to the C# queue, and again, we will make it work only with integers. Later on, we will learn how to implement it in a way that will allow us to work with any type. It will have the following functionality:

- `void Enqueue(int element)` – Adds the given element to the queue.
- `int Dequeue()` – Removes the first element.
- `int Peek()` – Returns the first element in the queue without removing it.
- `void Clear()` – Deletes all elements in the queue.
- `void ForEach(Action<int> action)` – Goes through each of the elements in the queue.

Feel free to implement your functionality or to write the methods by yourself.

## 1. Implement the CustomList Class

### Details about the Structure

First of all, we must make it clear how our structure should work under the provided public functionality.

- It should hold a sequence of items in an array. 
- The structure should have a capacity that grows twice when it is filled, always starting at 2. 

The `CustomList` class should have the properties listed below:

- `int[] items` – An array that will hold all of our elements.
- `int Count` – This property will return the count of items in the collection.
- Indexer – The indexer will provide us with functionality to access the elements using integer indexes.

### Implementation

Create a new public class `CustomList` and add a private constant field named `InitialCapacity` and set the value to 2. This field is used to declare the initial capacity of the internal array. It's always a good practice to use constants instead of magic numbers in your classes. This approach makes the code better for managing and reading.

#### Implement `void Add(int element)` Method

It is time to create the method that adds a new element to the end of our collection, just like in the C# lists. If our internal array is filled, we have to increase it by twice the length it currently has and add the new element.

#### Implement `int RemoveAt(int index)` Method

The `RemoveAt()` method has the functionality to remove an item at the given index and return the item. Here’s a breakdown of the steps involved:
- Validate the index.
- Remove the element and shift the remaining elements.
- Resize the array if necessary.

## 2. Implement the CustomStack Class

### Details about the Structure

The implementation of a custom stack is straightforward. You only execute actions over the last index of the collection. The `CustomStack` class should have the properties listed below:

- `int[] items` – An array that will hold all of our elements.
- `int Count` – This property will return the count of items in the collection.
- `const int InitialCapacity` – This constant's value will be the initial capacity of the internal array.

### Implementation

Create a new public class `CustomStack` and add a private constant field named `InitialCapacity` and set the value to 4. Initialize the collection inside the constructor of the class.

#### Implement `void Push(int element)` Method

This method adds an element to the end of the collection, just like the C# Stack `Push()` method does.

#### Implement `int Pop()` Method

The `Pop()` method returns the last element from the collection and removes it.

#### Implement `int Peek()` Method

The `Peek()` method returns the last element from the collection without removing it. Ensure to validate that the collection is not empty.

## 3. Implement the CustomQueue Class

### Details about the Structure

When implementing a custom queue, remember that you add elements at the end and remove elements from the beginning of the queue. The `CustomQueue` class should have the properties listed below:

- `void Enqueue(int element)` – Adds the given element to the queue.
- `int Dequeue()` – Removes the first element.
- `int Peek()` – Returns the first element in the queue without removing it.
- `void Clear()` – Deletes all elements in the queue.
- `void ForEach(Action<int> action)` – Iterates over each element in the queue.

### Implementation

Create a new public class `CustomQueue` and add a private constant field named `InitialCapacity` and set the value to 4. Initialize the collection and set up the `Count` property.

#### Implement `void Enqueue(int element)` Method

This method adds an element at the end of the collection, just like the C# Queue `Enqueue()` method.

#### Implement `int Dequeue()` Method

The `Dequeue()` method returns the first element from the collection and removes it.

#### Implement `int Peek()` Method

The `Peek()` method returns the first element from the collection without removing it.

#### Implement `void Clear()` Method

The `Clear()` method removes all elements from the collection.

#### Implement `void ForEach(Action<object> action)` Method

This method goes through every element from the collection and executes the given action.
