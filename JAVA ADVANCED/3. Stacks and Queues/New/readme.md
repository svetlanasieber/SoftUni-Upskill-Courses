
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
