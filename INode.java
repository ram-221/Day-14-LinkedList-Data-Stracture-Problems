package com.bridgelabzlinkedlistuc04;

public interface INode<K> {
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);

}
