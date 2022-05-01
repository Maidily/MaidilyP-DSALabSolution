package com.lab3.problem2;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		// declaring input variable
		Node root = null;
		int size, sum;
        
		FindSumPair pair = new FindSumPair();
		Scanner sc = new Scanner(System.in);
		
		// accepting elements in tree
		System.out.println("Enter the number of nodes for the BST : ");
		size = sc.nextInt();
		
		for(int i = 0; i < size; i++) 
		{
			System.out.println("Enter the value of node " + (i+1) + ": ");
			root = pair.insert(root, sc.nextInt());
		}
		
		// getting sum value from user
		System.out.println("Enter the Sum value to check : ");
		sum = sc.nextInt();
		
		
		// retrieving sum pair
		pair.findPairWithSum(root, sum);
		
		
		// closing scanner
		sc.close();
		
	}

}