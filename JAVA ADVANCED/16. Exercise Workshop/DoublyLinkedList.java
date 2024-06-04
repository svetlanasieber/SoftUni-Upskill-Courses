package WorkshopExercise;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class DoublyLinkedList {
    class Node {

        int element;
        Node next;
        Node prev;

        public Node(int element) {
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element) {
        Node newNode = new Node(element);

        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
         
            newNode.next = this.head;
          
            this.head.prev = newNode;
          
            this.head = newNode;
        }
        this.size++;
    }

    public void addLast(int element) {
        Node newNode = new Node(element);

        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
        
            newNode.prev = this.tail;
           
            this.tail.next = newNode;
           
            this.tail = newNode;
        }
        this.size++;
    }

    public int get(int index) {
        checkIndex(index);

        Node currentNode;

        if (index <= this.size / 2) {
            currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return currentNode.element;
    }

    public int removeFirst() {
        checkEmpty();
        int element = this.head.element;
        this.head = this.head.next;

        if (this.head == null) {
       
            this.tail = null;
        } else {
           
            this.head.prev = null;
        }
        this.size--;
        return element;
    }


    public int removeLast() {
        checkEmpty();
        int element = this.tail.element;

        this.tail = this.tail.prev;

        if (this.tail == null) {
            this.head = null;
        } else {
            this.tail.next = null;
        }
        this.size--;
        return element;
    }

    
    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;

        while (currentNode != null) {
            consumer.accept(currentNode.element);
            currentNode = currentNode.next;
        }

    }

    
    public int[] toArray() {
        int[] array = new int[this.size];
        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            array[index++] = currentNode.element;
            currentNode = currentNode.next;
        }

        return array;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty!");
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(
                    String.format("Index %d is out of bounds for size %d", index, this.size)
            );
        }
    }
}
