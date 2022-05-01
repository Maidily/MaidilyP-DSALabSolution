package com.lab3.problem1;

import java.util.Stack;

public class BalancingBrackets {

	public Boolean checkBalancedBrackets(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		
		// checking if String has balanced brackets
		for(int i = 0; i < input.length(); i++)
		{
			char bracket = input.charAt(i);
						
			if( bracket == '(' || bracket == '[' || bracket == '{' ) 
			{
				stack.push(bracket);
			}
			
			if(!stack.isEmpty()) 
			{
				if( (bracket == ')' && stack.peek().equals('(')) 
						|| (bracket == ']' && stack.peek().equals('['))
						|| (bracket == '}' && stack.peek().equals('{')) ) 
				{
					stack.pop();
				}
				else if( bracket == ')' || bracket == ']' || bracket == '}' ) 
				{
					stack.push(bracket);
				}
			}
			else if( bracket == ')' || bracket == ']' || bracket == '}' ) 
			{
				stack.push(bracket);
			}
			
		}
		
		return (stack.isEmpty());
	}

}