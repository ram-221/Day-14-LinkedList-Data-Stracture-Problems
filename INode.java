package com.bridgelabzlinkedlistuc05;

public interface INode<K> {
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);

}
