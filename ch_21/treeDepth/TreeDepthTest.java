package com.treeDepth;
import java.security.SecureRandom;

public class TreeDepthTest {

	public static void main(String[] args) {
		SecureRandom randomInts = new SecureRandom();
		Tree<Integer> tree = new Tree<>();
		
		for (int i = 0; i < 21; i++) {
			int fill = randomInts.nextInt(101);
			tree.insertNode(fill);
		}
		
		tree.preorderTraversal();
		System.out.println();
		
		System.out.printf("The depth of the tree is: %d", tree.getDepth());

	}

}
