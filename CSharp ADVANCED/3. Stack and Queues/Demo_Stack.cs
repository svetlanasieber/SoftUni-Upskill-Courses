using System.Collections.Generic;

Stack<int> stack = new Stack<int>(); //new();

stack.Push(1);
stack.Push(2);
stack.Push(3);
stack.Push(4);

Console.WriteLine(stack.Pop()); // 4
Console.WriteLine(stack.Pop()); // 3
Console.WriteLine(stack.Pop()); // 2
Console.WriteLine(stack.Pop()); // 1

//Console.WriteLine(stack.Peek());
//Console.WriteLine(string.Join(", ", stack)); // 4, 3, 2, 1 
