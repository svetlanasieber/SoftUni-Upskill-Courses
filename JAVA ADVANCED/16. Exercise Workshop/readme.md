# Workshop: Custom Linked List

This document defines the lab for the "Java Advanced" course @ Software University.

## Overview

In this workshop, we will create a custom data structure similar to Java's `LinkedList`, specifically designed to work with integers. The custom linked list will support the following functionalities:

- `void addFirst(int element)` – Adds an element at the beginning of the list.
- `void addLast(int element)` – Adds an element at the end of the list.
- `int get(int index)` – Returns the element at the specified position in the list.
- `int removeFirst()` – Removes and returns the element at the beginning of the list.
- `int removeLast()` – Removes and returns the element at the end of the list.
- `void forEach(Consumer<Integer> consumer)` – Iterates through the list and applies a given action to each element.
- `int[] toArray()` – Converts the list to an array of integers.

Feel free to extend the functionality by adding your own methods.

## 1. Implement the Custom DoublyLinkedList Class

### Structure Details

A doubly-linked list is a linear data structure where each element, or node, contains references to both the previous and the next node, along with a value. This structure allows for efficient insertion and removal of elements from both ends of the list. Key concepts include:

- **ListNode**: A class representing a single node in the list, containing an integer value and references to the previous and next nodes.
- **DoublyLinkedList**: A class representing the entire list, managing its head (first node), tail (last node), and the operations performed on the list.

For more detailed information on doubly linked lists, you can refer to [this article](https://en.wikipedia.org/wiki/Doubly_linked_list).

### Implementation Steps

#### 1.1 Create the ListNode Class

The `ListNode` class should be defined inside the `DoublyLinkedList` class, as it will only be used internally. Each `ListNode` contains:

- An `int` value.
- A reference to the previous node.
- A reference to the next node.

#### 1.2 Implement Head, Tail, and Count

Define the `head` and `tail` of the list as `ListNode` references. The `head` points to the first element, and the `tail` points to the last element of the list.

#### 1.3 Implement `void addFirst(int element)` Method

This method adds a new element at the beginning of the list. The process involves:

- **Empty List**: Set the new element as both the head and the tail.
- **Non-empty List**: Add the new element as the new head and update the previous head's reference.

#### 1.4 Implement `void addLast(int element)` Method

Similar to `addFirst`, this method adds a new element at the end of the list. The process involves:

- **Empty List**: Set the new element as both the head and the tail.
- **Non-empty List**: Add the new element as the new tail and update the previous tail's reference.

#### 1.5 Implement `int get(int index)` Method

This method returns the element at a specified position in the list. The implementation involves:

- Validate the index.
- If the index is less than half the list size, iterate from the head; otherwise, iterate from the tail for efficiency.

#### 1.6 Implement `int removeFirst()` Method

This method removes and returns the element at the beginning of the list. Consider these scenarios:

- **Empty List**: Throw an exception.
- **Single Element List**: Set both head and tail to `null`.
- **Multiple Elements**: Remove the head and update the new head.

#### 1.7 Implement `int removeLast()` Method

This method removes and returns the element at the end of the list. It is similar to `removeFirst()` but works from the tail instead of the head.

#### 1.8 Implement `void forEach(Consumer<Integer> consumer)` Method

This method iterates through each element in the list, applying a given action. Start from the head and traverse the list until the end.

Example usage to print all elements:
```java
list.forEach(System.out::println);

