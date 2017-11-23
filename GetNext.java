package algorithm;

public class GetNext {
	
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
		BinaryTreeNode parent;
	}
	
	public static BinaryTreeNode getNext(BinaryTreeNode pNode) {
		if(pNode == null)
			return null;
		
		BinaryTreeNode pNext = null;
		if(pNode.right != null) {
			BinaryTreeNode pRight = pNode.right;
			while(pRight.left != null) {
				pRight = pRight.left;
			}
			pNext = pRight;
		}
		else if(pNode.parent != null) {
			BinaryTreeNode pCurrent = pNode;
			BinaryTreeNode pParent = pNode.parent;
			while(pParent != null && pCurrent == pParent.right) {
				pCurrent = pParent;
				pParent = pParent.parent;
			}
			pNext = pParent;
		}
		
		return pNext;
	}
}
