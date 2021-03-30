package Throw;

import java.util.NoSuchElementException;

public class Stack {
	private int[] Ar;
	private int top, size, capacity;

	public Stack(int capacity) throws Exception {
		if (capacity < 1)
			throw new Exception("Underflow");

		this.capacity = capacity;
		Ar = new int[capacity];
		size = 0;
		top = -1;
	}

	public boolean isFull() {
		if (capacity == size)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public void diplay() {
		if (isEmpty())
			throw new NoSuchElementException("Stack is Empty");
		System.out.print("Stack is: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(Ar[i] + " ");
		}
		System.out.println();
	}

	public void Push(int value) {
		if (isFull())
			throw new ArrayIndexOutOfBoundsException("Stack is Full");
		top++;
		size++;
		Ar[top] = value;
	}

	public void Pop() throws myException {
		if (isEmpty())
			throw new myException();
		top--;
		size--;
	}

	public int Size() {
		return size;
	}

	public int peek() {
		return Ar[top];
	}

	@SuppressWarnings("serial")
	public class myException extends Exception {

	}

	public static void main(String[] args) {
		try {
			Stack obj = new Stack(3);
			obj.Push(4);
			obj.Push(6);
			obj.Push(2);
			obj.Push(9);
			obj.Push(1);
			obj.Pop();
			System.out.println(obj.peek());
			System.out.println(obj.Size());
			obj.diplay();
		} catch (myException e) {
			System.out.println("STACK IS EMPTY.UNDERFLOW!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
