package com.ohadr.dictionary;

public class Dictionary 
{
	//sorted list of nodes - all chars are sorted
	Node	rootNode;

	public Dictionary()
	{
		rootNode = new Node();
	}
		
	
	/**
	 * 
	 * @param word
	 * @return true if success, false if word already exists
	 */
	public boolean addWord(String word)
	{
		return addWord(word, rootNode);
	}
	
	private boolean addWord(String word, Node node)
	{
		if(word == null || word.isEmpty())
		{
			if(node.isEndOfWord())
			{
				//word already exists:
				return false;
			}
			else
			{
				//word was added successfully:
				node.setEndOfWord(true);
				return true;
			}
		}
		
		char c = word.charAt(0);
		
		//check if we have a node for this char:
		Node child = null;
		Node[] nodes = node.getChildren();
		
		//get the ASCII value of this character:
		int ascii = c - 'a';
		child = nodes[ascii];
				
		if(child == null)		//if we did not find, allocate node for this char
		{
			child = new Node();
			nodes[ascii] = child;
		}
		
		//make the same call for the rest of this word:
		return addWord(word.substring(1), child);
	}

	
	boolean deleteWord(String word)
	{
		return deleteWord(word, rootNode);
		
	}
	
	private boolean deleteWord(String word, Node node)
	{
		if(word == null || word.isEmpty())
		{
			if(node.isEndOfWord())
			{
				//we found the word:
				node.setEndOfWord(false);
				return true;
			}
			else
			{
				//word does not exist
				return false;
			}
		}
		
		char c = word.charAt(0);
		
		//check if we have a node for this char:
		Node child = null;
		Node[] nodes = node.getChildren();		//never NULL - ctor init
		
		//get the ASCII value of this character:
		int ascii = c - 'a';
		child = nodes[ascii];
				
		if(child == null)		//if we did not find, allocate node for this char
		{
			//word does not exist:
			return false;
		}
		
		//make the same call for the rest of this word:
		return deleteWord(word.substring(1), child);
	}

	
	void printStartsWith(String prefix)
	{
		
	}

}