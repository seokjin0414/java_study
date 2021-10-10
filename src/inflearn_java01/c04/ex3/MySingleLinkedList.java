package inflearn_java01.c04.ex3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MySingleLinkedList<T> {

	private Node<T> head;
	private int size;

	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
// inner class
	private static class Node<T> {
		public T data;
		public Node<T> next;

		public Node(T item) {
			data = item;
			next = null;
		}
	}
	
	public Iterator<T> iterator() {
		return new MyIterator();
	}
	
	private class MyIterator implements Iterator<T> {
		private Node<T> nextNode;
		
		public MyIterator() {
			nextNode = head;
		}
		
		public boolean hasNext() {
			return (nextNode != null);
		}
		
		public T next() {
			if (nextNode == null)
				throw new NoSuchElementException();
			T val = nextNode.data;
			nextNode = nextNode.next;
			return val;
		}
		
		public void remove() {
			// ?
		}
	}

	private void addFirst(T item) {
		Node<T> newNode = new Node<T>(item); // T : type parameter

		newNode.next = head;
		head = newNode;
		size++;

//		Node<T>[] arr = new Node<T>[100]; // not ok
//		T t = new T(); // not ok
//		T[] array = new T[100]; // not ok
	}

	private void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}

	private T removeFirst() {
		if (head == null)
			return null;
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}

	private T removeAfter(Node<T> before) {
		if (before.next == null)
			return null;

		T temp = before.next.data;
		before.next = before.next.next;
		size--;
		return temp;
	}

	public int indexOf(T item) {
		Node<T> p = head;
		int index = 0;
		while (p != null) {
			if (p.data.equals(item))
				return index;
			p = p.next;
			index++;
		}
		return -1;
	}

	private Node<T> getNode(int index) {
		if (index < 0 || index >= size)
			return null;
		Node<T> p = head;
		for (int i = 0; i < index; i++)
			p = p.next;
		return p;
	}

	public T get(int index) {
		if (index < 0 || index >= size)
			return null;

//		Node<T> p = head;
//		for (int i = 0; i < index; i++)
//			p = p.next;
//		return p.data;

		return getNode(index).data;
	}

	public void add(int index, T item) { // insert
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();

		if (index == 0)
			addFirst(item);
		else {
			Node<T> q = getNode(index - 1);
			addAfter(q, item);
		}
	}

	public T remove(int index) { // delete
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		if (index == 0)
			return removeFirst();
		Node<T> prev = getNode(index - 1);
		return removeAfter(prev);
	}

	public boolean remove(T item) {
		Node<T> p = head, q = null;
		while (p != null && !p.data.equals(item)) {
			q = p;
			p = p.next;
		}

		if (p == null)
			return false;
		if (q == null) {
			T tmp = removeFirst();
			return (tmp != null);
		} else {
			T tmp = removeAfter(q);
			return (tmp != null);
		}

	}

	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();

		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday"); // M, S, F
		list.add(2, "Tuesday"); // M, S, T, F

		String str = list.get(2); // str = "Tuesday";
		list.remove(2); // M, S, F
		int pos = list.indexOf("Friday"); // pos = 2
	}

}
