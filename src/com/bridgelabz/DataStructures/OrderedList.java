package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class OrderedList <T>{
	
	static Node HEAD;	
	/**static add function to add a data inside a list
	 * @param data the data wants to add in a list
	 */
public static <T extends Comparable<T>> void add(T data)
	{
	Node node=new Node();
	node.data=data;
	node.nextNode=null;
	if(HEAD==null)
		HEAD=node;
	else
	{
		Node temp=HEAD;
		while(temp.nextNode!=null)
		{
			temp=temp.nextNode;
		}
		temp.nextNode=node;
	}
}

/**static search funtion is to search the given word.
 * @param word the word which has to be search.
 * @return integer which is position of the word.
 */
public static <T extends Comparable<T>> int search(T word)
{
		Node temp=HEAD;
		int i=0;
		while(temp!=null)
		{
			if(temp.data.equals(word))
			{
				return i;
			}
			temp=temp.nextNode;
				i++;
		}
	
	return -1;
}

/**static remove funtion is to remove the word in given position.
 * @param position the word which has to be remove.
 */
public static <T extends Comparable<T>> void remove(int position)
{
	if(position==0)
	{
		HEAD=HEAD.nextNode;
	}
	else
	{
		Node n=HEAD;
		Node temp=null;
		for(int i=0;i<position-1;i++)
		{
			n=n.nextNode;
		}
		temp=n.nextNode;
		n.nextNode=temp.nextNode;
		temp=null;
	}
		
}
	
/**static function show to display the list.
 * 
 */
public  <T extends Comparable<T>> void show()
	{
		Node node=HEAD;
		while(node.nextNode!=null)
		{
			System.out.println(node.data);
			node=node.nextNode;
		}
		System.out.println(node.data);
	}
	
	public static void operation(String number,String []sortArray) throws IOException
	{
		OrderedList list=new OrderedList();
		for(int i=0;i<sortArray.length;i++)
		{
			list.add(sortArray[i]);
		}
		
		int position=list.search(number);
		if(position==-1)
			list.add(number);
		else
			list.remove(position);
		
		list.show();
		File file=new File("/home/bridgeit/zeeshan/Files/OrderedListOut.txt");
		Node node=HEAD;
		while(node.nextNode!=null)
		{
			Utility.printwrite(file,node.data);
			node=node.nextNode;
		}
		Utility.printwrite(file,node.data);
	}

}