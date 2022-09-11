package com.bridgelabzlluc1;

class MyNode<K> {
	private K key;
	MyNode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key){
		this.key = key;
	}

	public MyNode getNext(){
		return next;
	}

	public void SetNext(MyNode next) {
		this.next = next;
	}
	public void print() {
	System.out.println(getKey());
	}

}

public class LinkedList {

	public static void main(String[] args) {
		givenNumbersWhenLinkedListPassedLinkedListTest();
	}
	public static  void givenNumbersWhenLinkedListPassedLinkedListTest() {

		MyNode<Integer> firstNumberNode = new MyNode<>(56);
		MyNode<Integer> secondNumberNode = new MyNode<>(30);
		MyNode<Integer> thirdNumberNode = new MyNode<>(70);
		firstNumberNode.SetNext(secondNumberNode);
		secondNumberNode.SetNext(thirdNumberNode);
		boolean result = firstNumberNode.getNext().equals(secondNumberNode) && 
				secondNumberNode.getNext().equals(thirdNumberNode);
		System.out.println(result);
		firstNumberNode.print();
		secondNumberNode.print();
		thirdNumberNode.print();
		}

}
