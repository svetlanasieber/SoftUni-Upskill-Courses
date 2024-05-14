
# Demo2

 stack and a queue are both abstract data types that can be implemented in Java. They are used to store and manipulate a collection of elements. However, they differ in the order in which elements are added and removed.

A stack is a Last-In-First-Out (LIFO) data structure, which means that the last element added to the stack will be the first one to be removed. In other words, it follows the "last in, first out" principle. Stacks can be implemented in Java using the java.util.Stack class or the java.util.Deque interface with the addFirst() and removeFirst() methods.

A queue is a First-In-First-Out (FIFO) data structure, which means that the first element added to the queue will be the first one to be removed. In other words, it follows the "first in, first out" principle. Queues can be implemented in Java using the java.util.Queue interface with the add() and remove() methods, or the java.util.LinkedList class with the addFirst(), addLast(), removeFirst(), and removeLast() methods.


------------------------------------------------------------------------------------------------------------------

From the perspective of the Java API (and not the computer science notion of abstract data types), we effectively have two stack implementations:

# The Stack. 
This is your textbook last-in-first-out collection, and it does not implement Java's Queue interface. So in that sense, Java is not considering a stack a type of Queue. But things get a little more complicated when we consider...

# The Deque. 
Also known as the "double ended queue". According to Java's own documentation, Stack is deprecated in favor of using one of the Deque's concrete implementations (like ArrayDeque). The interesting thing to note about a Deque is that it does implement the Queue interface. After all, a double ended queue is effectively a combination of both a Queue and a Stack (you just choose which end you want to pop from).
Java considers a Stack a type of Queue because its preferred implementation of the Stack is a double ended queue, which is both a Stack and a Queue simultaneously. In other words, implementing a LIFO stack and a FIFO queue are not mutually exclusive concepts.
---------------------------------------------------------------------------------------------

# Difference between Stack and Queue

# Stack

The stack is based on LIFO(Last In First Out) principle
Insertion Operation is called Push Operation
Deletion Operation is called Pop Operation
Push and Pop Operation takes place from one end of the stack
The most accessible element is called Top and the least accessible is called the Bottom of the stack
Simple Implementation
Only one pointer is used for performing operations
There are no variants available for stack
Can be considered as a vertical collection visually
Used to solve the recursive type problems

# Queue

The queue is based on FIFO(First In First Out) principle.
Insertion Operation is called Enqueue Operation
Deletion Operation is called Dequeue Operation
Enqueue and Dequeue Operation takes place from a different end of the queue
The insertion end is called Rear End and the deletion end is called the Front End.
Complex implementation in comparison to stack
Two pointers are used to perform operations
There are three types of variants i.e circular queue, double-ended queue and priority queue
Can be considered as a horizontal collection visually
Used to solve the problem having sequential processing
Application of Stack Data Structure

# There are many applications of stack data structure in real life. Some of them are as given below:

Stack is used for expression evaluation
Stack is used for parenthesis matching while working with expressions.
Stack is used in expression conversion. For example, infix to postfix or prefix to postfix
Stack is used in memory management
It is used in java virtual machine
It is used for the Backtracking problem-solving method
It is used in string parsing or string reversal.
Stack is used to matching the HTML tags in web development
Stack is also used in function call for recursive functions.
Application of Queue Data Structure

# There are many applications of queue data structure in real life. Some of them are as given below:

The queue is used as a waiting list when the resource is to be shared with multiple systems. For example, CPU scheduling or disk scheduling
It is used in the operating system for FCFS scheduling, semaphores, buffer for devices and spooling the printers
Queues are used in routers and switches
In networking, the queue is used when data is transferred asynchronously
Used in maintaining the playlist in media players
Used to handle interrupts in the operating system
The queue is used in the round-robin scheduling algorithm

