/*
	ArrayQueue.java
	Author: Aileen L. Cai
	Data Structures and Algorithms (CS 245)
	David Guy Brizan
	04/09/2020
*/


public class ArrayQueue<T> implements Queue<T>
{
	protected T[] array;
	protected int front;
	protected int back;
	protected int size;
	protected int capacity;

	public ArrayQueue()   //constructor method
	{
		array = (T[]) new Object[10]; //initializing template array of size ten
		front = 0;
		back = -1;
		size = 0;
		capacity = array.length;
	}

	private void growArray()
	{
		array = (T[]) new Object[array.length *2]; //function to double the size of the array 
	}

	public boolean full()      //checks if the queue is full
	{
		if (size == capacity)
			return true;
		return false;
	}

	public T dequeue() throws Exception   //taking data out of the queue (first in first out) 
	{
		if (empty() == true)
		{
			throw new Exception("Queue is empty.");
		}
		else 
		{
			size--;
			return array[front];
		}
	}

	public void enqueue(T data)   //adding data to the queue 
	{
		if (full() == true)
			growArray();
		else
		{
			array[back] = data;
			size++;
		}
	}

	public boolean empty()    //checks if the queue is empty
	{
		if (size == 0)
			return true;
		return false;
	}	

}