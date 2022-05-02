/**
 * 
 */
package com.greatlearning.app;
import java.util.Arrays;

import com.greatlearning.model.*;
/**
 * @author NithishDongreT
 *
 */
public class Driverclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bt = new BinarySearchTree();  
        //Add nodes to the binary tree  
		bt.insert(40);
		bt.insert(20);
		bt.insert(60);
		bt.insert(50);  
        bt.insert(30);  
        bt.insert(70);
        bt.insert(10);  
        
        int sum = 1300;
        int flag = -1;
        
        System.out.println("Binary search tree after insertion:");  
        //Displays the binary tree 
        bt.inorderTraversal(bt.root);  
        System.out.println(Arrays.toString(BinarySearchTree.st.toArray())); 
        String[] element = Arrays.toString(BinarySearchTree.st.toArray()).replaceAll("\\[", "").replaceAll("]", "").replaceAll(" ", "").split(",");
        int[] array = new int[element.length];
        
        for (int i = 0; i < element.length; i++) {
        	array[i] = Integer.valueOf(element[i]);
        }
        
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
            {
            	if (array[i] + array[j] == sum) {
            		flag = 1;
            		System.out.println("Pair is ("+array[i]+","+array[j]+")");
            	}
            }
        
        if(flag < 0) {
        	System.out.println("nodes are not found");
        }
        
        
        
	}

}
