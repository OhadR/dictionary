package com.ohadr.dictionary;

public class Node 
{
	private boolean bEndOfWord;
	private Node[] children;

	public Node()
	{
		children = new Node[56];	//a..z, A..Z
	}
	
	
	public boolean isEndOfWord() 
	{
		return bEndOfWord;
	}

	public void setEndOfWord(boolean bEndOfWord)
	{
		this.bEndOfWord = bEndOfWord;
	}

	public Node[] getChildren()
	{
		return children;
	}

}
