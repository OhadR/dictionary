package com.ohadr.dictionary;

public class Test 
{
	public static void main(String[] args)
	{
		Dictionary dic = new Dictionary();
		
		myAssert(dic.addWord("ohad"));
		myAssert(dic.addWord("oha") );		//shorter word
		myAssert(dic.addWord("ohadr") );	//longer word

		myAssert(dic.addWord("oha") );		//same word - expect failure
}
	
	public static void myAssert(boolean b)
	{
		if(!b)
		{
			System.err.println("ERROR: action failed");
		}
	}
}
