/*
	ArrayStack.java
	Author: Aileen L. Cai
	Data Structures and Algorithms (CS 245)
	David Guy Brizan
	04/09/2020
*/


public class ArrayStack<T> implements Stack<T>
{
	protected T[] array;
	protected int top;

	public ArrayStack()
	{
		array = (T[]) new Object[10]; //initializing template array of size ten
		top = 0;
	}

	private void growArray()
	{
		array = (T[]) new Object[array.length *2]; //function to double the size of the array 
	}

	public void push (T item)  //inserting an item into tthe stack 
	{
		if (top == array.length-1)
			growArray();
		else 
			array[top++] = item;
	}

	public T pop() throws Exception   //removing the last inserted piece of data
	{
		T pop;

		if (top < 0)
		{
			throw new Exception("EmptyStackException");
		}

		else 
		{
			pop = array[top--];
		}

		return pop;
	}

	public T peek() throws Exception  //looking at the top of the stack
	{
		T peek;
		if (top < 0)
		{
			throw new Exception("EmptyStackException");
		}

		else 
		{
			peek = array[top];
		}
			
		return peek;
	}

	public boolean empty()   //checking if the stack is empty 
	{
		if (top == 0)
			return true;
		return false; 
	}
}
