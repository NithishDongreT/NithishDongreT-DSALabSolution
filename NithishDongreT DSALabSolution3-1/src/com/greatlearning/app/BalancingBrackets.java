/**
 * 
 */
package com.greatlearning.app;

import java.util.Stack;
/**
 * @author NithishDongreT
 *
 */
public class BalancingBrackets {
	
	public static void main(String[] args) {
		
		Stack<Character> st = new Stack<Character>();
		String str = "( [ [ { } ] ] ) )";
		
		for (int i = 0; i < str.length(); i++) {
			
			/* If the current character is starting bracket,
            then push them in a stack*/
			if (str.charAt(i) == ' ') {
				continue;
				
			} else if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
			} else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') 
					|| (str.charAt(i) == '}' && st.peek() == '{') || (str.charAt(i) == ')' && st.peek() == '('))) 
			{
				st.pop();
			} else {
				st.push(str.charAt(i));
			}
		}
		
		if(st.empty()) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
	//Declare a stack
    

}
