package com.lab3.problem2;

import java.util.ArrayList;

public class FindSumPair {
	
	public Node insert(Node root, int key)
	{
		if(root == null) {
			return new Node(key);
		}	
		if(key < root.data) {
			root.left = insert(root.left, key);
		}
		else {
			root.right = insert(root.right, key);
		}
		
		return root;
	}
	
	public void findPairWithSum(Node root, int sum) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// fetching inorder traversal in a list
		list = inOrder(root, list);
		
		// finding sum pair
		if(!findSumPair(list, sum)) 
		{
			System.out.print("Nodes are not found");
		}
		
	}

	public boolean findSumPair(ArrayList<Integer> list, int sum) 
	{
		if(list == null || list.isEmpty()) {
			return false;
		}
		else
		{
			int start = 0;
			int end = list.size() - 1;
			
			while (start < end) 
			{
				if (list.get(start) + list.get(end) == sum) 
				{
					System.out.println("Pair is (" + list.get(start) + "," + list.get(end) + ")");
					return true;
				}
				else if (list.get(start) + list.get(end) > sum) {
					end--;
				}
				else if (list.get(start) + list.get(end) < sum) {
					start++;
				}
			}
			
			return false;
		}
	}

	public ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) 
	{
		if(root == null) {
			return null;
		}
		else 
		{
			inOrder(root.left, list);
			list.add(root.data);
			inOrder(root.right, list);
		}
		return list;
	}
	
}
